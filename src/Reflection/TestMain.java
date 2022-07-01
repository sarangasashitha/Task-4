package Reflection;

import static Reflection.KUnit.*;

public class TestMain {
	
	void checkConstructorAndAccess() {
		Main s = new Main (10,20,30);
		checkEquals(s.getA(),10);
		checkEquals(s.getB(),20);
		checkEquals(s.getC(),30);
		checkNotEquals(s.getA(),10);
		checkNotEquals(s.getB(),20);
		checkNotEquals(s.getC(),30);
		
	}

	void checkSquareA() {
		Main s=new Main(10,20,30);
		s.squareA();
		checkEquals(s.getA(),100);
		checkNotEquals(s.getA(),100);
		checkEquals(s.getA(),10);	
	}
	
	void checkSquareB() {
		Main s=new Main(10,20,30);
		s.squareB();
		checkEquals(s.getB(),400);
		checkNotEquals(s.getB(),400);
		checkEquals(s.getB(),20);	
	}
	
	void checkSquareC() {
		Main s=new Main(10,20,30);
		s.squareC();
		checkEquals(s.getC(),900);
		checkNotEquals(s.getC(),900);
		checkEquals(s.getC(),30);	
	}
	
	public static void main(String[] args) {
		TestMain ts=new TestMain();
		ts.checkConstructorAndAccess();
		ts.checkSquareA();
		ts.checkSquareB();
		ts.checkSquareC();
		report();
		
	}

}