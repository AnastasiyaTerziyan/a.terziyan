package ru.kpfu.itis.group11408.terziyan.stack;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayStack<T> implements SuperStack<T> {
	private final int STACK_SIZE = 20;
	private Object[] stack = new Object[STACK_SIZE];
	private int size = 0;

	public T pop() throws Exception {
		if (!isEmpty()) {
			size--;
			T last = (T) stack[this.size];
			stack[this.size] = null;
			return last;
		} else {
			throw new Exception("Popping is unavaliable for empty stack");
		}
	}

	public T peek() throws Exception {
		if (!isEmpty()) {
			return (T) stack[this.size - 1];
		} else {
			throw new Exception("Nothing to peek");
		}
	}

	public void push(T t) {
		stack[size] = t;
		size++;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		// return stack[0] == null;
		return this.size == 0;
	}
}