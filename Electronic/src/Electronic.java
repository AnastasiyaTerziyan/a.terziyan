import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class Electronic implements Comparable {
	public double cost;
	public int year;
	public double grade;
	public double weight;
	String s;
	
	public double formula() {
		return (this.cost / 1000 + this.year + this.grade + this.weight);
	}

	public String toString() {
		return s + " " + formula();
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Electronic){
			if (this.formula() > ((Electronic) o).formula()) {
				return 1;
			} else if (this.formula() < ((Electronic) o).formula()) {
				return -1;
			} else return 0;
		} else return 100;
	}

	public Electronic(double cost, int year, double grade, double weight) {
		this.cost = cost;
		this.year = year;
		this.grade = grade;
		this.weight = weight;

	}
}
