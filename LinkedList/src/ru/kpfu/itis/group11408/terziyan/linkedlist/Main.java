package ru.kpfu.itis.group11408.terziyan.linkedlist;

public class Main {

	public static void main(String[] angs){
		MyLinkedList<String> list = new MyLinkedList<String>();
		list.add(0,"FIRST");
		list.add(1,"Last");
		list.add("My");
		list.add("cat");
		list.add("Chip");
		list.add("--------");
		list.add(list.size(),"QWERTY");
		list.add("12j");
		list.add("hjkl");
		list.add("jdkddkdiee");
		list.add("12345");
		list.add(null);
		list.toString();
		list.add("[]");
		list.add(0,"ADD");
		list.add(0,"love");
		list.toString();
		System.out.println(list.contains("Cat")+" Cat");
		System.out.println(list.get(3));
		System.out.println("--------");
		System.out.println(list.indexOf("cat"));
		list.toString();		//list.remove(2);
		list.remove(0);
		list.remove(2);
		list.toString();
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.set(3, "SET"));
		list.remove(0);
		list.toString();		//list.add("Cattt", 3);

		}

}
