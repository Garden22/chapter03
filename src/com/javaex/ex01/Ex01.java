package com.javaex.ex01;

public class Ex01 {
	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass()); // 클래스 정보
		System.out.println("=====================================");
		
		System.out.println("hashcode");
		System.out.println(obj.hashCode()); // 메모리의 주소값에 대응되는 중복되지 않는 값
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		System.out.println(obj01.hashCode());
		System.out.println(obj02.hashCode());
		System.out.println(obj03.hashCode());
		System.out.println("=====================================");

		System.out.println("obj.toString()");
		System.out.println(obj.toString());
		System.out.println("=====================================");
		
		System.out.println("obj.equals(obj)");
		System.out.println(obj.equals(obj));
		System.out.println("=====================================");
		
	}
}
