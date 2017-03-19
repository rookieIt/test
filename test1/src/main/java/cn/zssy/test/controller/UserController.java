package cn.zssy.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.zssy.test.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/login")
	@ResponseBody
	User login(String username,String password){
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return user;
	}

}
