package com.java.inheritance;

public class State extends Person {
	private String name;

	public State() {
		super();
		name="中华人民共和国";
	}

	public State(String name) {
		super("奥巴马","男",60);
		this.name = name;
	}
	
	public void showState() {
		System.out.println("国家:"+this.name+"\n");
	}
	
	

}
