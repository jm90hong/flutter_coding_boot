package com.my.flutter_coding_boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.flutter_coding_boot.dao.TodoDao;
import com.my.flutter_coding_boot.vo.Todo;

@Service
public class TodoService {
	
	@Autowired
	TodoDao todoDao;
	
	
	public int updateCom(Todo todo) {
		return todoDao.updateCom(todo);
	}
	
	public int add(Todo todo) {
		return todoDao.add(todo);
	}
	
	public List<Todo> getAll(){
		return todoDao.getAll();
	}
}
