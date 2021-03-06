package ru.kpfu.itis.group11408.terziyan.semesterwork_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;

public class Dijkstra<V> {
	// ��������� vertex �� �����������
	private class VertexComparator implements Comparator<Vertex> {

		@Override
		public int compare(Vertex o1, Vertex o2) {
			if (o1.mark > o2.mark)
				return 1;
			if (o1.mark < o2.mark)
				return -1;
			else
				return 0;
		}
	}

	// ��������
	private PriorityQueue<Vertex> distances;
	private int number;
	private Vertex<V> start;
	private int end;
	private OrientedGraph<V> graph;

	public Dijkstra(int end, OrientedGraph<V> graph) {
		this.start = graph.getAll().get(0);
		this.graph = graph;
		this.end = end;
		this.number = graph.getSize();
		Comparator<Vertex> comparator = new VertexComparator();
		distances = new PriorityQueue<>(10, comparator);
	}

	public void findWay() {
		final int START = start.getNumber();
		final int INF = Integer.MAX_VALUE;
		int[] marks = new int[graph.getSize()];
		marks[0] = 0;
		for (int i = 1; i < marks.length; i++) {
			marks[i] = INF;
		}
		int[] ancestors = new int[graph.getSize()];
		for (int i = 0; i < ancestors.length; i++) {
			ancestors[i] = -1;
		}
		while (number != 0) {
			LinkedList<Vertex<V>> linked = (LinkedList) graph
					.getLinkedVertex(start);
			if (!linked.isEmpty()) {
				linked.remove(0);
				Iterator it = linked.iterator();
				while (it.hasNext()) {
					Vertex vertex = (Vertex) it.next();
					// System.out.println(vertex.number + " " +
					// vertex.distanceTo + " " + vertex.mark);
					if (marks[vertex.getNumber()] > vertex.getDistanceTo()
							+ marks[start.getNumber()]) {
						marks[vertex.getNumber()] = vertex.getDistanceTo()
								+ marks[start.getNumber()];
						vertex.mark = marks[vertex.getNumber()];
						distances.add(vertex);
						ancestors[vertex.getNumber()] = start.getNumber();
					}
				}
			}
			number--;
			if (!linked.isEmpty()) {
				start = distances.poll();
			}
		}

		Stack stack = new Stack();
		for (int i = end; i != -1; i = ancestors[i]) {
			stack.push(i);
		}
		int[] path = new int[stack.size()];
		for (int i = 0; i < path.length; i++)
			path[i] = (Integer) stack.pop();
		System.out.println("distance between: " + START + " and " + end
				+ " is " + marks[end]);
		System.out.println("path: " + Arrays.toString(path));
	}
}
