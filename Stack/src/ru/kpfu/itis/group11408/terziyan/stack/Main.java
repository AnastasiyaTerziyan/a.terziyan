package ru.kpfu.itis.group11408.terziyan.stack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SuperStack<Character> stack = new ArrayStack<Character>();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		try {
			int n = s.length();
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) - '0' <= 9 && s.charAt(i) - '0' != -7
						&& s.charAt(i) - '0' != -8) {

				} else {
					if (s.charAt(i) == '(' || s.charAt(i) == '{'
							|| s.charAt(i) == '[') {
						stack.push(s.charAt(i));
					} else {
						if (!stack.isEmpty()
								&& ((s.charAt(i) - '0' < 0 && (Character) stack
										.peek() - '0' < 0) || (s.charAt(i) - '0' - 2 == (Character) stack
										.peek() - '0'))) {
							stack.pop();
						} else {
							stack.push('8');
							break;
						}
					}
				}
			}
		} catch (Exception e) {
		}
		if (stack.isEmpty()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
}