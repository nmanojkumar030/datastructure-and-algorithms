package com.manoj2;

public class OuterClass2 {

	public void display() {
		System.out.println(StaticNestedClass.x);
		InnerClass innerClass = new OuterClass2().new InnerClass();
		System.out.println(innerClass.y);

	}

	static class StaticNestedClass {
		private static int x = 5;
	}

	class InnerClass {
		private int y = 8;
	}

}
