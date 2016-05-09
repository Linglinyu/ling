package com.lly.best.service;

import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;

/**
 * 类描述: 
 * 修改人: lyq
 * 修改时间: 2016-04-11 12:00
 * 修改备注: 
 * @version V1.0
 * @param <LoginForm>
 */
public interface UserService {
	
	public User findUser(LoginForm loginForm);
}
