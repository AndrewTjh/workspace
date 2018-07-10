package demo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(encoding="UTF-8",value={"classpath:book.properties"})
public class BookConfigBean {
	@Value("${book.name}")
	String name;
	@Value("${book.author}")
	String author;
	@Value("${book.dynasty}")
	String dynasty;
	@Value("${book.price}")
	Double price;
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getDynasty() {
		return dynasty;
	}
	public Double getPrice() {
		return price;
	}
	
}
