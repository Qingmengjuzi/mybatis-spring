package com.why.mybatis.dao;

import java.util.List;

public interface UserDao {
	/*
	 * 根据id查询用户
	 */
	User queryUserById(int id);
	/*
	 * 根据用户名模糊查询用户列表
	 */
	List<User> queryUserByUsername(String username);
	/*
	 * 保存
	 */
	void saveUser(User user);

}
