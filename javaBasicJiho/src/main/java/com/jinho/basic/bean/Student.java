package com.jinho.basic.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
	private String name;
	private int age; // constructor

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	} // get set method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override 
	public void afterPropertiesSet() throws Exception { // TODO Auto-generated method stub 
        System.out.println("Student 빈 생성"); 
    }

	@Override 
	public void destroy() throws Exception {
// TODO Auto-generated method stub 
		System.out.println("Student 빈 소멸"); 
	} 
	
}
