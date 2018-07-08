package designPatterns.general;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebServiceClientFactory {
	static Map<String,Class<?>> webServices = new HashMap<String,Class<?>>();
	static {
		webServices.put("ws://account-ws:7700",AccountWebServiceClient.class);
		webServices.put("ws://member-ws:7800",MemberInfoWebServiceClient.class);
		webServices.put("ws://sms-ws:7900",SmsWebServiceClient.class);
		webServices.put("ws://human-ws:8000",Human.class);
	}
	Class<?> getWebService(String url) {
		return webServices.get(url);
	}
	
	/**
	 * object<--url,method,args(head,body),
	 * */
	public static Object callWebService(String url, String methodName, Object...args) throws Exception {
		Class<?> wsClz = webServices.get(url);
		Object wsIns = wsClz.newInstance();
		Object result = null;
		Class<?>[] argTypes = new Class<?>[args.length];
		for (int i = 0; i < argTypes.length; i++) {
			argTypes[i] = args[i].getClass();
		}
		Method method = wsClz.getMethod(methodName, argTypes);
		result = method.invoke(wsIns, args);
		return result; 
	}
	
	public static void main(String[] args) throws Exception {
//		Human human = Human.class.newInstance();
//		Human human2 = Human.class.newInstance();
//		human2.name = "Andrew";
//		Method method1 = Human.class.getMethod("talk", Human.class);
//		String result = (String)method1.invoke(human, human2);
//		System.out.println(result);
		Human human1 = new Human();
		human1.name = "Andrew";
		Human human2 = new Human();
		human2.name = "Brian";
//		String result = (String)WebServiceClientFactory.callWebService("ws://human-ws:8000", "introduce", human1, human2);
		String result = (String)WebServiceClientFactory.callWebService("ws://human-ws:8000", "selfIntroduce", new Object[]{"Andrew", human2});
		System.out.println(result);
	}
}

class Human {
	String sex;
	String name;
	Double height;
	Double weight;
	public void talk() {
		System.out.println("hello, world");
	}
	public String talk(String name) {
		return "hello, "+name;
	}
	public String talk(Human human) {
		return "hello, "+human.name;
	}
	public String introduce(Human human1, Human human2) {
		return "this is "+human1.name+", and this is "+human2.name;
	}
	public String selfIntroduce(String name, Human human1) {
		return "hello, my name is "+(this.name==null?name:this.name)+", nice to meet you, "+human1.name;
	}
}

class Account {
	Long id;
	String citizenId;
	String level;
	Double balance;
}

class Member {
	Long id;
	String name;
	String org;
	String addr;
}

class TextMessage {
	String receiver;
	String sender;
	String content;
}

class AccountWebServiceClient {
	void saveAccount(Account account) {
		System.out.println("save account");
	}
	void updateAccount(Account account) {
		System.out.println("update account");
	}
	Account findAccount(Long id) {
		System.out.println("find account");
		return null;
	}
}

class MemberInfoWebServiceClient {
	void saveMember(Member member) {
		System.out.println("save member");
	}
	Member getMember(Long id) {
		System.out.println("get member");
		return null;
	}
}

class SmsWebServiceClient {
	void sendSms(TextMessage msg) {
		System.out.println("send Sms");
	}
}
