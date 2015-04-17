package ru.kpfu.itis.group11408.terziyan.redblacktree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RedBlackTree<Integer, String> tree = new RedBlackTree<>();
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Введите элемент");
			int a = scan.nextInt();
			array[i] = a;
			tree.put(a, scan.next());
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(tree.get(array[i]));
		}
	}

}
