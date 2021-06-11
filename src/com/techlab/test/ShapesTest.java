package com.techlab.test;

import com.techlab.model.IShape;
import com.techlab.model.Rectangle;
import com.techlab.model.Square;

public class ShapesTest {
	public static void main(String []args) {
		Rectangle rt = new Rectangle(20, 4);
		Square sq = new Square(25);
		printInfo(rt);
		printInfo(sq);
	}
	private static void printInfo(IShape obj) {
		System.out.println("Total Area: "+obj.calculateArea());
	}
}
