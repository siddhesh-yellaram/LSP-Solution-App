package com.techlab.model;

public class Square implements IShape{
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public int calculateArea() {
		return side * side;
	}
	
}
