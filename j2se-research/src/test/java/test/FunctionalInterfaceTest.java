package test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import org.junit.Test;

/**
 * Supplier Consumer FunctionalInterface
 * */
public class FunctionalInterfaceTest {
	@Test
	public void testFunctionalInterface() {
		final Car car1 = Car.create(Car::new);
		final Car car2 = Car.create(Car::new);
		final List<Car> cars = Arrays.asList(car1, car2);
		cars.forEach(Car::showInfo);
		cars.forEach(Car::showInfo2);
//		cars.forEach(Car::collide);
//		cars.forEach(Car::repair);
//		final Car police = Car.create(Car::new);
//		cars.forEach(police::follow);
	}

}

//@FunctionalInterface
//interface Supplier<T> {
//	T get();
//}

class Car {
	// Supplier是jdk1.8的接口，这里和lambda一起使用了
	public static Car create(final Supplier<Car> supplier) {
		return supplier.get();
	}
	
	public static void showInfo(Car car) {
		System.out.println(car.toString());
	}
	
	public void showInfo2() {
		System.out.println(this.toString());
	}

	public static void collide(final Car car) {
		System.out.println("Collided " + car.toString());
	}

	public void follow(final Car another) {
		System.out.println("Following the " + another.toString());
	}

	public void repair() {
		System.out.println("Repaired " + this.toString());
	}
}
