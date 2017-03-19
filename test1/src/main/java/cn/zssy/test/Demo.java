package cn.zssy.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zssy.test.pojo.User;

//@Controller
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class Demo {
	

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(Demo.class, args);
	    }

}
