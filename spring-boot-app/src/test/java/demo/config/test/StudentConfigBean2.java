package demo.config.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import demo.model.test.Student;
import demo.model.test.Student1;
import demo.model.test.Student2;

@Configuration
@PropertySource("classpath:student.properties")
public class StudentConfigBean2 {
	@Bean("student1")
	public Student1 configStudent1() {
		Student1 student1 = new Student1();
		return student1;
	}
	
	@Bean("student2")
	public Student2 configStudent2() {
		Student2 student2 = new Student2();
		return student2;
	}
}
