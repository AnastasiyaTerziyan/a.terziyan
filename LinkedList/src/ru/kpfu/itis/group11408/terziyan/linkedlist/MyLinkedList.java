package ru.kpfu.itis.group11408.terziyan.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<T> {

	private Element first = null;
	private Element last = null;

	public void add(T obj) {

		if (first == null) {
			first = new Element(obj);
			last = first;
			return;
		}

		Element newLast = new Element(obj);

		last.setNext(newLast);
		last = newLast;

	}

	public void add(int index, T obj) {
		if (index == size()) {
			add(obj);
		}
		Element elem;

		if (index == 0) {
			elem = first;
		} else {
			elem = getElement(index - 1);
		}

		Element predNext = elem.getNext();
		Element newNext = new Element(obj, predNext);

		elem.setNext(newNext);

		if (elem == last) {
			last = newNext;
		}

	}

	public void clear() {

		first = null;
		last = null;

	}

	public boolean contains(T obj) {
		Element el = first;
		while (el != null) {
			if (obj == null || el.obj == null) {
				if (obj == el.obj) {
					return true;
				}
			} else if (obj.equals(el.obj)) {
				return true;
			}
			el = el.next;
		}
		return false;
	}

	public int size() {

		int size = 0;

		if (first == null) {
			return 0;
		}

		for (Element iter = first; iter != null; iter = iter.getNext(), size++)
			;

		return size;

	}

	public boolean isEmpty() {
		return first == null;
	}

	public int indexOf(T obj) {
		
		Element el = first;
		int k = -1;
		while (el != null) {
			k++;
			if (obj == null || el.obj == null) {
				if (el.obj == obj) {
					return k;
				}
			} else if (obj.equals(el.obj)) {
				return k;
			}
			el = el.next;
		}
		return k;
	}

	public int lastIndexOf(T obj) {
		Element el = first;
		int k = -1;
		int n = -1;
		while (el != null) {
			k++;
			if (obj == null || el.obj == null) {
				if (el.obj == obj) {
					n = k;
				}
			} else if (obj.equals(el.obj)) {
				n = k;
			}
			el = el.next;
		}
		return n;
	}

	public T set(int index, T element) {
		Element el = getElement(index - 1);
		T t = el.obj;
		el.obj = element;
		return t;
	}

	public void remove(int index) {

		if (first == null) {
			throw new IndexOutOfBoundsException(
					"Unable to delete element from empty list");
		}

		if (index == 0) {

			first = first.getNext();

			if (first == null) {
				last = null;
			}

			return;

		}

		Element predElement = getElement(index - 1);
		Element elemForDelete = predElement.getNext();

		if (elemForDelete == null) {
			throw new IndexOutOfBoundsException(
					"Deleting element that doesn't exist");
		}

		predElement.setNext(elemForDelete.getNext());

	}

	public T get(int index) {
		return getElement(index).getObj();
	}

	public T getFirst() {

		if (first == null) {
			throw new NoSuchElementException();
		}

		return first.getObj();

	}

	public T getLast() {

		if (last == null) {
			throw new NoSuchElementException();
		}

		return last.getObj();

	}

	@Override
	public String toString() {

		Element el = first;
		String st = "";
		while (el != null) {
			System.out.print(el.obj + " ");
			el = el.next;
		}
		System.out.println();
		return st;

	}

	private Element getElement(int index) {

		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(
					"Unable to get element by specified index" + index);
		}

		Element elem = first;

		for (int i = 0; i < index; i++, elem = elem.getNext())
			;

		return elem;

	}

	/*public Object[] toArray() {
		int n = size();
		Object[] array = new Object[n];
		Element el = first;
		for (int i = 0; i < n; i++) {
			array[i] = el.obj;
			el = el.next;
		}
		return array;
	}*/

	public class MyIterator implements Iterator<T> {
		private Element node = new Element(null, first);
		private Element previous = null;

		public T obj() {
			if (node == null) {
				throw new NoSuchElementException();
			}
			return node.obj;
		}

		public T next() {
			if (node == null || node.next == null) {
				throw new NoSuchElementException();
			}
			previous = node;
			node = node.next;
			return node.obj;
		}

		public boolean hasNext() {
			return node != null && node.next != null;
		}
	}

	public MyIterator iterator() {
		return new MyIterator();
	}

	private class Element {

		private T obj;
		private Element next = null;

		public Element(T obj) {
			this.obj = obj;
		}

		public Element(T obj, Element next) {
			this.obj = obj;
			this.next = next;
		}

		public T getObj() {
			return obj;
		}

		public void setNext(Element next) {
			this.next = next;
		}

		public Element getNext() {
			return next;
		}

	};
}