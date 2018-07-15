package demo.controller.test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import demo.controller.HomeController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest/*(classes = MockServletContext.class)*/
@WebAppConfiguration
public class HomeControllerTest {
    private MockMvc mock;
     
    @Before
    public void setUp() throws Exception {
        mock = MockMvcBuilders.standaloneSetup(new HomeController()).build();
    }
 
    @Test
    public void testHome() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().string(equalTo("Hello World!")));
    }
    
    @Test
    public void testSayHi() throws Exception {
    	MultiValueMap<String,String> params = new LinkedMultiValueMap<String,String>();
    	params.add("name", "Andrew");
    	mock.perform(MockMvcRequestBuilders.get("/sayHi").params(params).accept(MediaType.APPLICATION_JSON))
    	.andExpect(status().isOk())
    	.andExpect(content().string(equalTo("Hello, "+params.getFirst("name"))));
    }
    
//    @Test
//    public void testGetEnv() throws Exception {
//    	MultiValueMap<String,String> params = new LinkedMultiValueMap<String,String>();
//    	params.add("name", "profile");
//    	mock.perform(MockMvcRequestBuilders.get("/getEnv").params(params).accept(MediaType.APPLICATION_JSON))
//    	.andExpect(status().isOk())
//    	.andExpect(content().string(equalTo("test_environment!")));
//    }
}
