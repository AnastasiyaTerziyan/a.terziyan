package ru.kpfu.itis.group11408.terziyan.mystack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayStack<Character> stack = new ArrayStack<Character>();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' != -7
					&& s.charAt(i) - '0' != -8) {
				
			} else if (s.charAt(i) == '{' || s.charAt(i) == '['
					|| s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else if ((!stack.isEmpty()
					&& (s.charAt(i) - '0' < 0 && (Character) stack.peek() - '0' < 0) || (s
					.charAt(i) - '0' - 2 == (Character) stack.peek() - '0'))) {
				stack.pop();
			} else {
				stack.push('*');
				break;
			}
		}
		if (stack.isEmpty()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}