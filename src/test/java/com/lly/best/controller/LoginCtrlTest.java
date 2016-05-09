package com.lly.best.controller;


import org.junit.Test;

import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;
import com.lly.best.service.UserService;
import com.lly.best.service.impl.UserServiceImpl;

/**
 * 类描述: 
 * 修改人: 程文席
 * 修改时间: 2015-12-12 12:00
 * 修改备注: 
 * @version V1.0
 */
public class LoginCtrlTest {

	
	@Test
	public void loginTest(){
		String name = "112";
        User user = new User();
        LoginForm command = new LoginForm();
        command.setName(name);
        UserService userService = new UserServiceImpl();
        user = userService.findUser(command);
        System.out.print(user.getName());
	}
}
