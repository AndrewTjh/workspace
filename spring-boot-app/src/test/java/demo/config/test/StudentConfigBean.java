package demo.config.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import demo.model.test.Student;

//@Configuration
//@PropertySource("classpath:student.properties")
public class StudentConfigBean {
	@Value("${student1.name}")
	String student1Name;
	@Value("${student1.major}")
	String student1Major;
	@Value("${student1.GPA}")
	Double student1GPA;
	
	@Bean("student1")
	public Student configStudent1() {
		Student student1 = new Student();
		student1.setName(student1Name);
		student1.setMajor(student1Major);
		student1.setGPA(student1GPA);
		return student1;
	}
	
	@Bean("student2")
	public Student configStudent2(@Value("${student2.name}")String student2Name, @Value("${student2.major}")String student2Major, @Value("${student2.GPA}")Double student2GPA) {
		Student student2 = new Student();
		student2.setName(student2Name);
		student2.setMajor(student2Major);
		student2.setGPA(student2GPA);
		return student2;
	}
}
