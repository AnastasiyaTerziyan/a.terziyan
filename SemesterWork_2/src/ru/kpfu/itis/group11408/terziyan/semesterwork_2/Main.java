package ru.kpfu.itis.group11408.terziyan.semesterwork_2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	OrientedGraph<String> graph;
	int num = 1;

	private void add(Vertex vertex) throws IOException {
		Scanner sc = new Scanner(System.in);
		graph.addVertex(vertex);
		System.out.println("���������� ������ < " + num);
		int links = sc.nextInt(), number, distance, direction;
		if (links >= num)
			throw new IOException("������������ ���������� ������");
		num++;
		while (links != 0) {
			System.out
					.println("����� ������� � ������� �� ������ ������� ������ � ���������� �� ���");
			number = sc.nextInt();
			distance = sc.nextInt();
			System.out.println("1 ��� ���� � ���� �������, 2 ��� ���� �� ���");
			direction = sc.nextInt();
			switch (direction) {
			case 1:
				graph.link(graph.getAll().get(number),
						graph.getAll().get(vertex.number), distance);
				break;
			case 2:
				graph.link(graph.getAll().get(vertex.number), graph.getAll()
						.get(number), distance);
				break;
			default:
				throw new IOException(
						"�������� ����, ���������� ������ ��������� ����� ���� ������������");
			}
			links--;
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ����� ������");
		main.graph = new ListGraph<>(sc.nextInt());
		int size = main.graph.getSize();
		while (size != 0) {
			System.out.println("����� �������");
			try {
				main.add(new Vertex<>("Vertex"));
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			size--;
		}
		System.out.println("����� ������� �� ������� �� ������ ����� ����");
		Dijkstra<String> alg = new Dijkstra<>(sc.nextInt(), main.graph);
		alg.findWay();
	}
}
