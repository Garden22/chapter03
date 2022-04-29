package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(13, 15);
		
		// getClass는 틀(class)에 대한 정보
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		System.out.println("==============================");
		
		// toString은 객체(인스턴스)에 대한 정보 > 오버라이딩 안했으면 부모에 대한 정보
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		System.out.println("==============================");

		//메모리 주소값에 대응되는 중복되지 않는 숫자
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("==============================");

		//같은 객체인가? >> 기본적으로는 메모리가 같아야 true >> 값이 같을 때 같게 만들려면 오버라이딩해야
		System.out.println(p01.equals(p00));
		System.out.println(p01.equals(p01));
	}
}
