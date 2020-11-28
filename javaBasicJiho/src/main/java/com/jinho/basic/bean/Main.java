package com.jinho.basic.bean;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성 
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 스프링 컨테이너 설정 
		ctx.load("classpath:applicationCTX.xml"); 
		ctx.refresh(); // 빈 생성 -> afterPropertiesSet() 호 // 스프링 컨테이너 사용 
		Student student = ctx.getBean("student", Student.class); 
		System.out.println("이름 : " + student.getName()); 
		System.out.println("나이 : " + student.getAge()); // 스프링 컨테이너 종료 
		ctx.close(); //빈 소멸 -> destroy() 
		// 만약 student만 소멸 하고 싶으면(빈만 소멸 하고 싶다면..) // -> student.destroy() 호출하면 된다.		​
	}
}





