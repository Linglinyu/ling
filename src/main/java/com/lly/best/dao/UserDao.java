package com.lly.best.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lly.best.dao.base.BaseDaoImp;
import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;

/**
 * 类描述: userDao
 * 修改人: lyq
 * 修改时间: 2016-04-11 12:00
 * 修改备注: 
 * @version V1.0
 */
@Repository
public class UserDao extends BaseDaoImp<User, Integer>{
	public User findUser(LoginForm loginForm){
		String hql = "from User t where 1=1";
		User user = new User();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", loginForm.getName());
		map.put("password", loginForm.getPassword());
		user = super.getByHQL(hql.toString(), new Object[]{});
		
		return user;
	}
}
