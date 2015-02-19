import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int r; 
		int year, diag, processor, memory;
		double cost, grade, weight;
		Random rd = new Random();
		Electronic[] a = new Electronic[10];
		for (int i = 0; i < a.length; i++) {
			r = rd.nextInt(3);
			if (r == 0) {
				cost = 10000 + rd.nextInt(40000);
				grade = rd.nextInt(5);
				year = 2005 + rd.nextInt(10);
				weight = 100 + rd.nextInt(500);
				a[i] = new Phone(cost, year, grade, weight);
			} else if (r == 1) {
				cost = 10000 + rd.nextInt(400000);
				grade = rd.nextInt(5);
				year = 2005 + rd.nextInt(10);
				weight = 1000 + rd.nextInt(5000);
				diag = 20 + rd.nextInt(50);
				a[i] = new Tv(cost, year, grade, weight, diag);
			} else if (r == 2) {
				cost = 10000 + rd.nextInt(50000);
				grade = rd.nextInt(5);
				year = 2005 + rd.nextInt(10);
				weight = 1000 + rd.nextInt(1000);
				processor = 1 + rd.nextInt(6);
				memory = 1000 + rd.nextInt(8000);
				a[i] = new Computer(cost, year, grade, weight, processor, memory);
			}
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].toString());
		}
		/*a[0] = new Phone(14000, 1, 3.0, 0.300);
		//Electronic elect = new Electronic(15000, 2, 5.0, 1.700);
		//Electronic sams = new Tv(32000, 1, 4.0, 3.000, 17);
		//Electronic hell = new Computer(20000, 2, 4.5, 2.700, 2, 512);*/
	}
}
