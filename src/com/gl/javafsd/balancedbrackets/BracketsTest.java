package com.gl.javafsd.balancedbrackets;

public class BracketsTest {
	
	public static void main(String[] args) {
		
		test("([[{}]])");
		test("([[{}]]))");
		
	}
	
	private static void test(String brackets) {
			
		BracketChecker checker = new BracketChecker(brackets);
		boolean result = checker.check();
		
		if (result) {
			System.out.println("The entered String " + brackets + " has Balanced Brackets");			
		}
		else {
			System.out.println("The entered Strings " + brackets + " do not contain Balanced Brackets");
		}		
	}

}
