package com.rohini.resfull.RestAPI;

import java.util.HashMap;
import java.util.Map;

public enum TodoDao {

	instance;
	private Map<String,Todo> contentProvider=new HashMap<>();
	
	private TodoDao() {
		Todo todo=new Todo("1","Sairam");
		todo.setDescription("The Best");
		contentProvider.put("1", todo);
		todo=new Todo("2","Ganesh");
		todo.setDescription("The Best");
		contentProvider.put("2", todo);
	}
	
	public Map<String,Todo> getModel(){
		return contentProvider;
	}
}
