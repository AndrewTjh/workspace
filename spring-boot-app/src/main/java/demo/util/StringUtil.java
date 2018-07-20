package demo.util;

public class StringUtil {
	public static boolean isEmpty(String str) {
		return str == null || str.isEmpty();
	}
	public static boolean isTrimmedEmpty(String str) {
		return str == null || isEmpty(str.trim());
	}
}
