package cn.zssy.test;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

//@Controller
//@EnableAutoConfiguration
//@ComponentScan
//@SpringBootApplication
public class Demo extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	
		 //return builder.sources(Starter.class);  
		return super.configure(builder);
	}
	 /*@Override    
     protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {    
         return application.sources(Starter.class);    
     }    */

}
