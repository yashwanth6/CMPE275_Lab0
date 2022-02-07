package com.lab0;

public class HelloWorld implements Greeter {
	
	public String name;

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public String getGreeting() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

}
