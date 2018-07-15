package test.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;

public class StreamAPITest {
	@Ignore
	@Test
	public void test1() {
		Widget w11 = new Widget(Widget.RED, Widget.METAL, 2.2d);
		Widget w12 = new Widget(Widget.RED, Widget.METAL, 1.8d);
		Widget w13 = new Widget(Widget.GREEN, Widget.METAL, 3.5d);
		Widget w14 = new Widget(Widget.GREEN, Widget.METAL, 1.5d);
		Widget w15 = new Widget(Widget.GREEN, Widget.METAL, 1.8d);
		
		Widget w21 = new Widget(Widget.RED, Widget.WOOD, 0.8d);
		Widget w22 = new Widget(Widget.RED, Widget.WOOD, 1.2d);
		Widget w23 = new Widget(Widget.GREEN, Widget.WOOD, 0.9d);
		Widget w24 = new Widget(Widget.GREEN, Widget.WOOD, 1.5d);
		
		List<Widget> widgets = Arrays.asList(w11,w12,w13,w14,w15,w21,w22,w23,w24);
		Double sumWeight = widgets.stream()
			.filter(widget->widget.color==Widget.GREEN && widget.material==Widget.METAL && widget.weight > 1.5d)
			.sorted((widget1,widget2)->(int)(widget1.weight-widget2.weight))
//			.mapToDouble(widget->widget.weight)
			.mapToDouble(Widget::getWeight)
			.sum();
			
		System.out.println(sumWeight);
	}
	
	@Ignore
	@Test
	public void test2() {
		List<String> strings = Arrays.asList("enchanted", "cute", "", "benevolent", "enthusiastic", "altruism","", "enthralled");
		strings.stream()
			.filter(string->!string.isEmpty())
			.sorted((s1,s2)->s2.compareTo(s1))
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}
	
	@Ignore
	@Test
	public void test3() {
		Random random = new Random();
		random.ints(100, 1000).limit(10).forEach(System.out::println);
	}
	
	@Ignore
	@Test
	public void test4() {
		List<Integer> numbers = Arrays.asList(1,2,2,3,3,3,4,5);
		List<Integer> squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println(squaresList);
	}
	
//	@Ignore
	@Test
	public void test5() {
		List<String> strings = Arrays.asList("PHP", "Java", "Perl", "Javascript", "C", "Python", "C++", "C#", "OC");
		int count = (int)strings.parallelStream().filter(s->s.startsWith("C")).count();
		System.out.println(count);
	}
	
	
}

class Widget {
	public final static Integer RED = 1;
	public final static Integer GREEN = 2;
	public final static Integer BLUE = 3;
	public final static Integer YELLOW = 4;
	
	public final static Integer METAL = 1;
	public final static Integer PLASTIC = 2;
	public final static Integer WOOD = 3;
	public final static Integer FIBRE = 4;
	
	Integer color;
	Double weight;
	Integer material;
	
	public Widget() {
		
	}
	
	public Widget(Integer color, Integer material, Double weight) {
		this.color = color;
		this.material = material;
		this.weight = weight;
	}
	

	public Integer getColor() {
		return color;
	}
	public void setColor(Integer color) {
		this.color = color;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Integer getMaterial() {
		return material;
	}
	public void setMaterial(Integer material) {
		this.material = material;
	}
	
}
