package com.javaex.ex03;

public class PointApp {
	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		
		System.out.println(p01.equals(p00)); // (오버라이딩)값이 같니?
		System.out.println(p01 == p00); // 주소값이 같니?
	}
}
