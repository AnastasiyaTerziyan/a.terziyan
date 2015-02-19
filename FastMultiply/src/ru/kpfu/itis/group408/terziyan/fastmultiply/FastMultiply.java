package ru.kpfu.itis.group408.terziyan.fastmultiply;

import java.util.Scanner;

public class FastMultiply {
	public long mult(long x, long y, int n) {
		long p, a, b, c, d, m1, m2, m3;
		if ((x == Math.abs(x) && y == Math.abs(y))
				|| (x != Math.abs(x) && y != Math.abs(y))) {
			p = 1;
		} else
			p = -1;
		x = Math.abs(x);
		y = Math.abs(y);
		if (n == 1) {
			if (x == 1 && y == 1)
				return p;
			else
				return 0;
		} else {
			a = x >>> n / 2;
			b = x & ((1 << n / 2) - 1);
			c = y >>> n / 2;
			d = y & ((1 << n / 2) - 1);
			m1 = mult(a, c, n / 2);
			m2 = mult(a - b, d - c, n / 2);
			m3 = mult(b, d, n / 2);
			return p * ((m1 << n) + ((m1 + m2 + m3) << (n / 2)) + m3);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers 2");
		long x = sc.nextLong(), y = sc.nextLong();
		long t = System.currentTimeMillis();
		FastMultiply fm = new FastMultiply();
		System.out.println(fm.mult(x, y, 32));
		System.out.println(System.currentTimeMillis() - t);
	}
}
