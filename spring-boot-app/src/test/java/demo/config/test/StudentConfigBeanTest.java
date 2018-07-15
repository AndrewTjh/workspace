package demo.config.test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import demo.model.test.Student;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentConfigBeanTest {
	@Autowired
	Student student1;
	
	@Autowired
	Student student2;
	
	@Ignore
	@Test
	public void test() {
		System.out.println(student1.getName());
		System.out.println(student1.getMajor());
		System.out.println(student1.getGPA());
		System.out.println(student2.getName());
		System.out.println(student2.getMajor());
		System.out.println(student2.getGPA());
	}
	
}
