public class Tv extends Electronic {
	public int diag;

	public double formula(double cost, int year, double grade, double weight,
			int diag) {
		return super.formula() + diag;
	}

	public Tv(double cost, int year, double grade, double weight, int diag) {
		super(cost, year, grade, weight);
		this.diag = diag;
		super.s = "TV";
	}
}