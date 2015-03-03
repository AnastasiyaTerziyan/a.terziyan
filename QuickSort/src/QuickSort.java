import java.util.Scanner;

public class QuickSort {
	public static int[] a;

	public void qSort(int l, int r) {
		int i = l;
		int j = r;
		int x = a[(l + r) / 2];
		while (i <= j) {
			while (a[i] < x) {
				i++;
			}
			while (a[j] > x) {
				j--;
			}
			if (i <= j) {
				int z = a[i];
				a[i] = a[j];
				a[j] = z;
				i++;
				j--;
			}
		}

		if (l < j) {
			qSort(l, j);
		}
		if (i < r) {
			qSort(i, r);
		}
	}

	public static void main(String[] angs) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		long t = System.currentTimeMillis();
		QuickSort quick = new QuickSort();
		quick.qSort(0, n - 1);
		System.out.println(System.currentTimeMillis() - t);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
