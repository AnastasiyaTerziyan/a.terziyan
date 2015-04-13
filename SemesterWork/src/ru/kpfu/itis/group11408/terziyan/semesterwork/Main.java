package ru.kpfu.itis.group11408.terziyan.semesterwork;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 1, b = 1;
		Exception ex = null;
		// ������� ����� �����������
		try (FileWriter clear = new FileWriter("inner.txt")) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (a != 0 && b != 0) {
			System.out.println("������� ���������: ������ (2-3/4)*(0.5-2)/2");
			String exp = in.next();
			try {
				RPNForm worker = new RPNForm(exp);
				System.out.println(worker.getSolve());
			} catch (Exception e) {
				ex = e;
				b = 0;
				System.out.println(e.getMessage());
				System.out.println("�������� ������ �����");
			}
			if (ex == null) {
				System.out.println("����������? 1/0");
				a = in.nextInt();
			}
		}
		in.close();
	}

}
