package demo.config.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BookConfigBeanTest {
	@Value("${book2.name}")
	String bookName;
	@Value("${book2.author}")
	String bookAuthor;
	@Value("${book2.price}")
	Double bookPrice;
	@Value("${book2.dynasty}")
	String bookDynasty;
	
	@Autowired
	BookConfigBean bookConfig;
	
//	@Ignore
	@Test
	public void testConfigValueRead() {
		System.out.println(bookName);
		System.out.println(bookAuthor);
		System.out.println(bookPrice);
		System.out.println(bookDynasty);
	}
	
//	@Ignore
	@Test
	public void testBookConfig() {
		System.out.println(bookConfig.getName());
		System.out.println(bookConfig.getAuthor());
		System.out.println(bookConfig.getPrice());
		System.out.println(bookConfig.getDynasty());
	}
}
