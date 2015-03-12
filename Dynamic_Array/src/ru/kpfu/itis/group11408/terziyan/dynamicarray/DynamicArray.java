package ru.kpfu.itis.group11408.terziyan.dynamicarray;

public class DynamicArray {

	int size = 0;
	Object[] array;

	public DynamicArray() {
		array = new Object[10];
	}

	void addElement(Object e) {
		if (size + 1 > array.length) {
			Object[] arr = array;
			array = new Object[arr.length + 5];
			System.arraycopy(arr, 0, array, 0, size);
		}
		array[this.size] = e;
		size++;
	}

	void insertElement(Object e, int index) {
		if (index > this.size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		if (size + 1 > array.length) {
			Object[] arr = array;
			array = new Object[arr.length + 5];
			System.arraycopy(arr, 0, array, 0, size);
		}
		System.arraycopy(array, index, array, index + 1, size - index);
		array[index] = e;
		size++;
	}

	void removeElement(Object e) {
		for (int i = 0; i < size; i++) {
			if (e == null || array[i] == null) {
				if (e == array[i]) {
					System.arraycopy(array, i + 1, array, i, size - i - 1);
					size--;
					array[size] = null;
					break;
				}
			} else if (array[i].equals(e)) {
				System.arraycopy(array, i + 1, array, i, size - i - 1);
				size--;
				array[size] = null;
				break;
			}
		}
		if (size + 5 < array.length) {
			Object[] arr = array;
			array = new Object[arr.length - 5];
			System.arraycopy(arr, 0, array, 0, arr.length - 5);
		}
	}

	Object getElement(int index) {
		if (index > this.size || index < 0) {
			throw new IndexOutOfBoundsException("Out of diapason");
		}
		return array[index];
	}

	int getSize() {
		return size;
	}

	void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
