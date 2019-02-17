/**
 *
 */
package com.manoj2;

/**
 * @author mnanjundegowda
 *
 */
public class OuterClass {

	private int x = 4;

	public void displayOuter() {
		InnerClass innerClass = new OuterClass().new InnerClass();
		System.out.println(innerClass.y);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InnerClass innerClass = new OuterClass().new InnerClass();
		innerClass.displayInner();
		System.out.println(innerClass.y);
	}

	class InnerClass {

		private int y = 5;

		public void displayInner() {
			System.out.println(x);
		}
	}

}
