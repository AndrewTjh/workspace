package demo.util;

public class PropertyMerger<O,N> {
	public static <O,N> void merge(O oldEntity, N newEntity) {
		Class<?> oldClz = oldEntity.getClass();
		oldClz.getDeclaredFields();
		Class<?> newClz = newEntity.getClass();
		newClz.getDeclaredFields();
	}
}
