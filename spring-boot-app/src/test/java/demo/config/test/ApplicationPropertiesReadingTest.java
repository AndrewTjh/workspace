package demo.config.test;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest()
@RunWith(SpringRunner.class)
public class ApplicationPropertiesReadingTest {
	
	@Value("${spring.profiles.active}")
	String activeProfile;
	
	@Value("${profile}")
	String profile;
	
	@Value("${description}")
	String description;
	
	@Test
	public void test() {
		switch (activeProfile) {
		case "dev" : 
			assertEquals("dev_envrimont", profile);
			assertEquals("this is a development environment", description);
		break;
		case "test" : 
			assertEquals("test_envrimont", profile);
			assertEquals("this is a test environment", description);
		break;
		case "prod" : 
			assertEquals("prod_envrimont", profile);
			assertEquals("this is a production environment", description);
		break;
		default:
		break;
		}
	}
	
}