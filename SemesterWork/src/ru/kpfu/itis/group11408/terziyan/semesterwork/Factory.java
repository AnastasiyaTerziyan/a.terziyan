package ru.kpfu.itis.group11408.terziyan.semesterwork;

public class Factory {
	public Expression getExp(String actionType) {
		if (actionType == null)
			return null;
		if (actionType.equalsIgnoreCase("calculator"))
			return new ExpCalc();
		if (actionType.equalsIgnoreCase("operators"))
			return new Operators();
		return null;
	}
}
