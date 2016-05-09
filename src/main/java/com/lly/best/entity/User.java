package com.lly.best.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 类描述: user实体
 * 修改人: lyq
 * 修改时间: 2016-04-11 12:00
 * 修改备注: 新建
 * @version V1.0
 */
@XmlRootElement
@Entity
@Table(name="t_user")
public class User extends Object implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	/**
	* 主键
	*/
	@Id
	@Column(name="id")
	private String id;
	/**
	* 姓名
	*/
	@Id
	@Column(name="name")
	private String Name;
	/**
	* 密码
	*/
	@Id
	@Column(name="password")
	private String password;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
