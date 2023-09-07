package tests.factory;

import entities.Financing;

public class FinancingFactory {

	public static Financing createEmptyFinancing() {
		return new Financing(100000.0, 2000.0, 80);
	}
	
	public static Financing createEmptyFinancingMonthDifferent() {
		return new Financing(100000.0, 2000.0, 20);
	}

	public static Financing createFinancing(Double totalAmount, Double income, Integer months) {
		return new Financing(totalAmount, income, months);
	}
}
