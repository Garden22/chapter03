package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
	
		System.out.println(s01.toString());
		System.out.println(s02.toString());
		
		System.out.println(s01 == s02);
		
		String s03 = "하이"; // 객체를 새로 만듦(new String)
		String s04 = "하이"; // s03에서 생성한 객체를 데려옴 (s04 = s03)
		
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);
		
		s03 = "하이하이";
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		System.out.println(s03 == s04);
	}
}
