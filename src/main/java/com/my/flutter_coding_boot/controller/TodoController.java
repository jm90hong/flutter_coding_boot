package com.my.flutter_coding_boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.flutter_coding_boot.service.TodoService;
import com.my.flutter_coding_boot.vo.Todo;

@Controller
@RequestMapping(value="/todo")
public class TodoController {
	
	
	@Autowired
	TodoService todoService;
	
	
	@GetMapping("/")
	public @ResponseBody String home() {
		
		return "ok";
	}
	
	
	@PostMapping("/updateCom")
	public @ResponseBody String udpateCom(
				@RequestParam(value="todo_idx") int todo_idx,
				@RequestParam(value="complete_ny") String complete_ny
			) {
		
		
		Todo todo = new Todo();
		todo.setTodo_idx(todo_idx);
		todo.setComplete_ny(complete_ny);
		
		todoService.updateCom(todo);
		
		return "ok";
	}
	
	
	
	@PostMapping("/add")
	public @ResponseBody String add(
				@RequestParam(value="type") String type,
				@RequestParam(value="title") String title
			){
		
		Todo todo = new Todo();
		todo.setType(type);
		todo.setTitle(title);
		
		
		todoService.add(todo);
		
		return "ok";
	}
	
	
	@GetMapping("/all")
	public @ResponseBody List<Todo> all() {
		
		List<Todo> list = todoService.getAll();
		
		return list;
	}
}
