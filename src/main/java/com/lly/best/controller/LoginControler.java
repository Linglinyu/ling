package com.lly.best.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;
import com.lly.best.service.UserService;


/**
 * 类描述: 
 * 修改人: lyq
 * 修改时间: 2016-04-11 12:00
 * 修改备注: 
 * @version V1.0
 */

@Controller
@RequestMapping(value="/login")
public class LoginControler {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value="")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,LoginForm command ){
         String name = command.getName();
         String a = request.getMethod();
         User user = new User();
         user = userService.findUser(command);
         String password = user.getPassword();
         ModelAndView mv = new ModelAndView("/index/index","command","LOGIN SUCCESS, " + name +","+ password);
         return mv;
     }

}
