package demo.model.test;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix="student2")
public class Student2 {
	String name;
	String major;
	Double GPA;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gPA) {
		GPA = gPA;
	}
}
