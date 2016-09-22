package com.lly.best.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.lly.best.respositroy.UserRespository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;


/**
 * @author cwx
 * @date 2016/09/22 14:08
 * And it’s as if I never really even knew love until right now, in this moment, with you.
 */

@Controller
@RequestMapping(value = "/login")
public class LoginControler {

    @Resource
    private UserRespository userRespository;

    @RequestMapping(value = "")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, LoginForm command) {
        String name = command.getName();
        User user = userRespository.findByName(name);
        String password = user == null ? null : user.getPassword();
        ModelAndView mv = new ModelAndView("/index/index", "command", "LOGIN SUCCESS, " + name + "," + password);
        return mv;
    }

}
