package demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;

//@Configuration
public class DruidConfig {
	private static final Logger logger = LoggerFactory.getLogger(DruidConfig.class);
	
//	#spring.datasource.druid.WebStatFilter.enabled=true
//	#spring.datasource.druid.StatViewServlet.enabled=true
	
//	@Bean
	public ServletRegistrationBean druidWebStatFilter() {
		ServletRegistrationBean servletRegBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
		servletRegBean.addInitParameter("loginUsername", "admin");
		servletRegBean.addInitParameter("loginPassword", "admin123");
		servletRegBean.addInitParameter("resetEnable", "false");
		return servletRegBean;
	}
	
//	@Bean
	public FilterRegistrationBean druidStatViewFilter() {
		FilterRegistrationBean filterRegBean = new FilterRegistrationBean(new WebStatFilter());
		filterRegBean.addInitParameter("urlPatterns", "/*");
		filterRegBean.addInitParameter("exclusions", "*.js,*.css,*.png,*.gif,*.jpg,*.bmp,*.ico,/druid/*");
		return filterRegBean;
	}
	
}
