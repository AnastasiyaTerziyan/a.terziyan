package ru.kpfu.itis.group11408.terziyan.graph;

import java.util.Collection;

public interface OrientedGraph<V> {
	void addVertex(Vertex<V> vertex);

	void link(Vertex<V> from, Vertex<V> to);

	void unlink(Vertex<V> one, Vertex<V> two);

	void remove(Vertex<V> vertex);

	boolean isLinked(Vertex<V> one, Vertex<V> two);

	Collection getLinkedVertex(Vertex<V> vertex);
}
