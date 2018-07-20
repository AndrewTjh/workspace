package test.api;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;

public class DateFormatTest {
	@Ignore
	@Test
	public void test() {
		DateFormat dateFormat = DateFormat.getDateInstance();
		String str = dateFormat.format(new Date());
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		String name = "Andrew";
		String str = String.format("hello, %s", name);
		System.out.println(str);
	}
}
