package com.lly.best.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lly.best.dao.base.BaseDaoImp;
import com.lly.best.dto.LoginForm;
import com.lly.best.entity.User;

/**
 * @author cwx
 * @date 2016/09/22 14:08
 * And it’s as if I never really even knew love until right now, in this moment, with you.
 */
//@Repository
public class UserDao extends BaseDaoImp<User, Integer> {
    public User findUser(LoginForm loginForm) {
        String hql = "from User t where 1=1";
        User user = new User();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", loginForm.getName());
        map.put("password", loginForm.getPassword());
        user = super.getByHQL(hql.toString(), new Object[]{});

        return user;
    }
}
