public class Computer extends Electronic {

	public int processor;
	public int memory;

	public double formula() {
		return super.formula() + processor + memory;
	}

	public Computer(double cost, int year, double grade, double weight,
			int processor, int memory) {
		super(cost, year, grade, weight);
		this.processor = processor;
		this.memory = memory;
		super.s = "Computer";
	}
}
