package ru.kpfu.itis.group408.terziyan.minmax;
import java.util.Scanner;

public class MinMax {
	int min(int a[], int left, int right) {
		int x, y, m;
		// ����� �������� �� ��������
		if (left == right)
			return a[left];
		// ������� �������� "������" ��������
		if ((left - right) == 1 || (right - left) == 1) {
			return a[left] < a[right] ? a[left] : a[right];
		}
		// ��������� ��������
		m = (left + right) / 2;

		// �������� ����� � ������ �� ��������
		x = min(a, left, m);
		y = min(a, m, right);

		// �������� ����������� �� �����������
		if (x < y)
			return x;
		else
			return y;
	}

	int max(int a[], int left, int right) {
		int x, y, m;
		// ����� �������� �� ��������
		if (left == right)
			return a[left];
		// ������� �������� "������" ��������
		if ((left - right) == 1 || (right - left) == 1) {
			return a[left] > a[right] ? a[left] : a[right];
		}
		// ��������� ��������
		m = (left + right) / 2;

		// �������� ����� � ������ �� ��������
		x = max(a, left, m);
		y = max(a, m, right);

		// �������� ����������� �� �����������
		if (x > y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		MinMax minMax = new MinMax();

		int mas[] = new int[n];
		for (int i = 0; i < n; i++) {
			mas[i] = scan.nextInt();
		}
		System.out.println(minMax.min(mas, 0, n - 1));
		System.out.println(minMax.max(mas, 0, n - 1));
	}

}
