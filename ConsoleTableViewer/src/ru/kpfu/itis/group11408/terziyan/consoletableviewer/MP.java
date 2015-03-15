package ru.kpfu.itis.group11408.terziyan.consoletableviewer;

import java.util.Comparator;
import java.util.Random;

public class MP implements ModelProvider<Student> {

	public Comparator<Student> getComparator() {
		return new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				if (o1.grade > o2.grade)
					return 1;
				else if (o1.grade < o2.grade)
					return -1;
				else
					return 0;
			}
		};
	}

	public String randomName() {
		Random rd = new Random();
		String[] names = { "Anastasia", "Natalia", "Aliya", "Timur", "Vadim",
				"Diana", "Margo", "Ilyas", "Nikita", "Vladislav", "Maksim",
				"Anvar", "Ilgiz", "Aleksander", "Azat", "Ilyas", "Sasha",
				"Alina", "Timur", "Mikhail", "Ildar", "Ilya" };
		return names[rd.nextInt(names.length - 1)];

	}

	public Student[] getElements(int n) {
		Student[] st = new Student[n];
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			st[i] = new Student(rd.nextInt(100), 1970 + rd.nextInt(30),
					this.randomName());
		}
		return st;
	}
}