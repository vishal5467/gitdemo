package com.qa.data;

public class users {

	String name;
	String job;
	String id;
	String createdaat;


public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedaat() {
		return createdaat;
	}

	public void setCreatedaat(String createdaat) {
		this.createdaat = createdaat;
	}

public users(){
	
}

public users(String name, String job){
	this.name = name;
	this.job = job;
	
	
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}
}