package com.lly.best.respositroy;

import com.lly.best.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.jws.soap.SOAPBinding;


/**
 * @author cwx
 * @date 2016/09/22 14:08
 * And it’s as if I never really even knew love until right now, in this moment, with you.
 */
@Transactional
public interface UserRespository extends CrudRepository<User, String> {

    User findByName(String name);
}
