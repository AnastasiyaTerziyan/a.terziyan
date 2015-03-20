package ru.kpfu.itis.group11408.terziyan.stack;

public interface SuperStack<T> {
	T pop() throws Exception;

	T peek() throws Exception;

	void push(T t);

	int size();

	boolean isEmpty();
}
