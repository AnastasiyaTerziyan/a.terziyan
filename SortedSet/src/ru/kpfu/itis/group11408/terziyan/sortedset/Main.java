package ru.kpfu.itis.group11408.terziyan.sortedset;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MySet<String> set = new MySet<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			set.add(sc.next());
		}
		boolean a = true;
		while (a) {
			System.out.println(set.iterator().next());
			if (!set.iterator().hasNext())
				a = false;
		}
	}

}
