package ru.kpfu.itis.group11408.terziyan.mystack;

import java.util.ArrayList;

public class ArrayStack <T> {
	ArrayList<T> list = new ArrayList<T>();
	
	T pop(){
		return list.remove(list.size() - 1);
	}
	
	void push(T e){
		list.add(e);
	}
	
	T  peek(){
		return (T) (list.get(size()-1));
	}
	
	int size(){
		return list.size();
	}
	
	boolean isEmpty(){
		return (list.size() == 0);
	}
	
}