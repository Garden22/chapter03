package com.javaex.ex05;

public class Rectangle {
	
	private int width;
	private int height;
	
	Rectangle() {
		
	}
	
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean equals(Rectangle r) {
		if (this.width * this.height == r.width * r.height) {
			return true;
		} else {
			return false;
		}
	}
}
