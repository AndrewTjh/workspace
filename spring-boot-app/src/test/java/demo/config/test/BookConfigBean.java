package demo.config.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(encoding="UTF-8",value={"classpath:book.properties"})
public class BookConfigBean {
	@Value("${book1.name}")
	String name;
	@Value("${book1.author}")
	String author;
	@Value("${book1.dynasty}")
	String dynasty;
	@Value("${book1.price}")
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
