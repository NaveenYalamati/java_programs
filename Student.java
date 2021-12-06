package com.methods;

public class Student {

	int id;
	String name;
	
	final static String clg = "AKRG";

	Student(){
	}

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	String getColName() {
		return clg;
	}
	
	void display(){
		System.out.println("id["+this.id+"] name["+this.name+"]");
	}
}
