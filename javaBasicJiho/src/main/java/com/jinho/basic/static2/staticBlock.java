package com.jinho.basic.static2;

public class staticBlock {

	public static void main(String[] args) {
	    Student.name = "하하하";
	    System.out.println(Student.name);
	    
	    new Student();
	    System.out.println("---------------------------");
	    new Student();
	}
	
	  static class Student {

		    static String name = "홍길동"; // 변수 선언에 값을 초기화시키는 문장을 포함할 수 있다.
		    int age = 20 ;
		    
		    static {
		      System.out.println("static...1");
		      name = "임꺽정";
		    }
		    static {
		      System.out.println("static...2");
		      name = "유관순";
		    }
		    
		    { // 인스턴스 블록
		        // 인스턴스 블록은 인스턴스 주소를 보관한 this라는 변수가 내장되어 있다.
		      
		        System.out.println(age);
		        System.out.println("{인스턴스 블록 실행...1}");
		        this.age = 30;
		      }
		      {
		        System.out.println("{인스턴스 블록 실행...2}");
		      }
	}

}
