package com.my.flutter_coding_boot.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.flutter_coding_boot.vo.Todo;

@Repository
public class TodoDao {
	
	
	
	@Autowired
	SqlSession sqlSession;
	
	
	public int updateCom(Todo todo) {
		return sqlSession.update("todo.updateCom",todo);
	}
	
	public int add(Todo todo) {
		return sqlSession.insert("todo.add",todo);
	}
	
	
	public List<Todo> getAll(){
		return sqlSession.selectList("todo.getAll");
	}
	
	
	
}
