package ru.kpfu.itis.group11408.terziyan.dynamicarray;

public class Main {

	public static void main(String[] args) {
		DynamicArray array = new DynamicArray();
		array.print();
		array.addElement("cat");
		array.addElement("my");
		array.addElement("best");
		array.addElement("love");
		array.addElement(2);
		array.addElement(null);
		array.insertElement(3, 2);
		array.addElement("cat");
		array.print();
		array.addElement("my");
		array.addElement("best");
		array.addElement("love");
		array.addElement(2);
		array.addElement(5);
		array.insertElement(3, 2);
		System.out.println(array.getSize());
		array.print();
		array.removeElement("love");
		array.removeElement("love");
		array.removeElement("cat");
		array.removeElement("my");
		array.removeElement("my");
		array.removeElement(3);
		array.print();
		System.out.println(array.getElement(5));
		System.out.println(array.getSize());
	}

}
