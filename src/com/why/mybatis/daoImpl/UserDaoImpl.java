package com.why.mybatis.daoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.why.mybatis.dao.User;
import com.why.mybatis.dao.UserDao;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{

	@Override
	public User queryUserById(int id) {
		// 获取SQLSession
		SqlSession sqlSession = super.getSqlSession();
		//使用SQLSession执行操作
		User user = sqlSession.selectOne("queryUserById",id);
		//不要关闭sqlSession
		return user;
	}

	@Override
	public List<User> queryUserByUsername(String username) {
		// 获取SQLSession
		SqlSession sqlSession = super.getSqlSession();
		//使用SQLSession执行操作
		List<User> list = sqlSession.selectList("queryUserByUsername",username);
		//不要关闭SQLSession
		return list;
	}

	@Override
	public void saveUser(User user) {
		// 获取SQLSession
		SqlSession sqlSession = super.getSqlSession();
		//使用SQLSession执行操作
		sqlSession.insert("saveUser",user);
		
		//不要提交，事物由spring进行管理
		//不用关闭SQLSession
		
	}

	
	
}
