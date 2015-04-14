package ru.kpfu.itis.group11408.terziyan.hashmap;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<>(4);
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter the pair");
			map.put(sc.nextInt(), sc.next());
		}
		Set<Integer> keys = map.keySet();
		int a = 0;
		for (int i = 0; i < keys.size(); i++) {
			System.out.println("Enter the key to get element for");
			a = sc.nextInt();
			String str = map.get(a);
			System.out.println(str);
		}
		System.out.println("Values:");
		Iterator iter = map.values().iterator();
		for (int i = 0; i < map.values().size(); i++) {
			System.out.println(iter.next());
		}
		System.out.println("Element to remove");
		map.remove(sc.nextInt());
		keys = map.keySet();
		System.out.println("Number of keys after removal: " + keys.size());
		map.clear();
		keys = map.keySet();
		System.out.println(keys.size());
	}

}
