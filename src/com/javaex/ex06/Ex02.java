package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
				
		System.out.println(a.concat(b)); // 스트링 합치기(a가 바뀌는건 아님)
		System.out.println(a);
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("ab", "12");
		System.out.println(a);
		
		String[] sArray = a.split(",");
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(i + " : " + sArray[i]);
		}
		
		String str = "Hello java!!";
		System.out.println(str.substring(0, 5));
		System.out.println(str.substring(6));
		System.out.println(str.charAt(11));
	}

}
