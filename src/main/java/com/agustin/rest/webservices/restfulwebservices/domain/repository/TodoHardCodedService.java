package com.agustin.rest.webservices.restfulwebservices.domain.repository;

import com.agustin.rest.webservices.restfulwebservices.domain.Todo;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TodoHardCodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static long idCounter = 0;
	static {
		todos.add(new Todo(++idCounter, "1", "Learn react", new Date(), false));
		todos.add(new Todo(++idCounter, "1", "Learn Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "1", "Learn Java", new Date(), false));
	}

	public List<Todo> findaAll() {
		return todos;
	}
	
	public Todo save(Todo todo) {
		if(todo.getId()==-1 || todo.getId()==0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if (todo == null)
			return null;
		if (todos.remove(todo)) {
			return todo;
		}
		return null;
	}

	public Todo findById(long id) {
		for (Todo todo : todos) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

}
