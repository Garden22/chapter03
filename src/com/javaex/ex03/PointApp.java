package com.javaex.ex03;

public class PointApp {
	public static void main(String[] args) {
		
		Point p01 = new Point(2, 3);
		Point p02 = new Point(2, 3);
		Point p03 = new Point(2, 2);
		Point p04 = p01;
		
		System.out.println(p01.equals(p02)); // (오버라이딩)값이 같니? true
		System.out.println(p02.equals(p01)); // true
		
		System.out.println(p01 == p02); // 주소값이 같니? false
		
		System.out.println(p01.equals(p03)); // false
		System.out.println(p02.equals(p03)); // false
		
		System.out.println(p01 == p04); // true >> p01이랑 같은 주소 가르킴
		System.out.println(p01.equals(p04)); // true
		
		System.out.println(p01.hashCode());
		System.out.println(p04.hashCode());
	}
}
