package ru.kpfu.itis.group11408.terziyan.polygon;

import java.util.Scanner;

public class Polygon {
	public static void main(String[] angs) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}

		boolean q = false;
		int t = x[n - 1] * y[0] - x[0] * y[n - 1];
		int z = t / Math.abs(t);
		int p = 1;
		System.out.println("t = " + t + " z = " + z + " p = " + p);
		for (int i = 0; i < n - 1; i++) {
			if (q) {
				break;
			}
			int r = x[i] * y[i + 1] - x[i + 1] * y[i];
			p = p * r / Math.abs(r);
			System.out.println("t = " + t + " z = " + z + " p = " + p + "r = "
					+ r + " x[" + i + "] = " + x[i] + " y[i] = " + y[i]);

			if (p < 0) {
				q = false;
			} else {
				q = true;
			}
		}
		System.out.println(q);
	}
}
