package ru.kpfu.itis.group11408.terziyan.semesterwork_2;

import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeMap;

public interface OrientedGraph<V> {
	void addVertex(Vertex<V> vertex);

	void link(Vertex<V> from, Vertex<V> to, int distance);

	void unlink(Vertex<V> one, Vertex<V> two);

	void remove(Vertex<V> vertex);

	boolean isLinked(Vertex<V> one, Vertex<V> two);

	Collection<Vertex<V>> getLinkedVertex(Vertex<V> vertex);

	int getDistance(Vertex<V> from, Vertex<V> to);

	int getSize();

	LinkedList<Vertex> getAll();
}
