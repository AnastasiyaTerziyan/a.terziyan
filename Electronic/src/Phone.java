public class Phone extends Electronic {

	public double formula(double cost, int year, double grade, double weight){
		return super.formula();
	}
	
	public Phone(double cost, int year, double grade, double weight) {
		super(cost, year, grade, weight);
		super.s = "Phone";
	}
}