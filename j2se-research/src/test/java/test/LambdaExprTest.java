package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * lambda 表达式的语法格式如下：
 * (parameters) -> expression
 * 或
 * (parameters) -> { statements; }
 * 以下是lambda表达式的重要特征:
 * 可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
 * 可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
 * 可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
 * 可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值。
 * */
public class LambdaExprTest {
	@Ignore
	@Test
	public void testLambdaExpr() {
		List<String> names1 = new ArrayList<String>();
		names1.add("Google");
		names1.add("Runoob");
		names1.add("Taobao");
		names1.add("Baidu");
		names1.add("Sina");
		List<String> names2 = new ArrayList<String>();
		names2.add("Apple");
		names2.add("Microsoft");
		names2.add("Amazon");
		names2.add("Twitter");
		names2.add("Facebook");
		List<String> names3 = new ArrayList<String>();
		names3.add("Huawei");
		names3.add("Tencent");
		names3.add("Qihoo");
		names3.add("Cisco");
		names3.add("Netease");
		List<String> names4 = new ArrayList<String>();
		names4.add("Japan");
		names4.add("USA");
		names4.add("China");
		names4.add("France");
		names4.add("Australia");
		
		Comparator<String> cmpLambda1 = (s1, s2)->s1.compareTo(s2);
		Comparator<String> cmpLambda2 = (s1, s2)->{return s1.compareTo(s2);};
		Comparator<String> cmpLambda3 = (String s1, String s2)->s1.compareTo(s2);
		Comparator<String> cmpLambda4 = (String s1, String s2)->{return s1.compareTo(s2);};
		
		Collections.sort(names1, cmpLambda1);
		Collections.sort(names2, cmpLambda2);
		Collections.sort(names3, cmpLambda3);
		Collections.sort(names4, cmpLambda4);
		
		System.out.println(names1);
		System.out.println(names2);
		System.out.println(names3);
		System.out.println(names4);
		
	}
	
	interface MathOperation {
		int operation(int a, int b);
        default int addition(int a, int b){
        	return a+b;
        }
        default int subtraction(int a, int b){
        	return a-b;
        }
        default int multiplication(int a, int b){
        	return a+b;
        }
        default int divison(int a, int b){
        	return a-b;
        }
	}
	
	static int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
	
	@Ignore
	@Test
	public void testLambdExpr2() {
		// 类型声明
		MathOperation addition = (int a, int b) -> a + b;
		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;
		// 大括号中的返回语句
		MathOperation multiplication = (int a, int b) -> { return a * b; };
		// 没有大括号及返回语句
		MathOperation divison = (a, b) -> a / b;
		
		int a = 10, b = 5;
		System.out.printf("%d + %d = %d\n", a, b, operate(10, 5, addition));
		System.out.printf("%d - %d = %d\n", a, b, operate(10, 5, subtraction));
		System.out.printf("%d * %d = %d\n", a, b, operate(10, 5, multiplication));
		System.out.printf("%d / %d = %d\n", a, b, operate(10, 5, divison));
		
	}
	
	@Ignore
	@Test
	public void testLambdExpr2_1() {
		MathOperation addition;
		MathOperation subtraction;
		MathOperation multiplication;
		MathOperation divison;
		int a = 10, b = 5;
//		System.out.printf("%d + %d = %d\n", a, b, operate(10, 5, addition));
//		System.out.printf("%d - %d = %d\n", a, b, operate(10, 5, subtraction));
//		System.out.printf("%d * %d = %d\n", a, b, operate(10, 5, multiplication));
//		System.out.printf("%d / %d = %d\n", a, b, operate(10, 5, divison));
		
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}
	
	@Ignore
	@Test
	public void testLambdExpr3() {
		GreetingService greetingWays1 = (s)->System.out.println("hello, "+s);
		GreetingService greetingWays2 = (s)->{System.out.println("howdy, "+s);};
		greetingWays1.sayMessage("lambda");
		greetingWays2.sayMessage("lambda");
	}
	
	interface Converter<T1, T2> {
		void convert(int i);
	}
	
	@Ignore
	@Test
	public void testLambdExpr4() {
		int num = 1;
		Converter<Integer,String> converterFunc = (param)->System.out.println(param+num);
		converterFunc.convert(2);
	}
	
	@Ignore
	@Test
	public void testLambdExpr5() {
		Comparator<String> compFunc = (s1,s2)->s1.length()-s2.length();
		List<String> names1 = new ArrayList<String>();
		names1.add("Tencent");
		names1.add("Disneyland");
		names1.add("Baidu");
		names1.add("Sina");
		names1.add("Taobao");
		Collections.sort(names1, compFunc);
		System.out.println(names1);
	}
	
}
