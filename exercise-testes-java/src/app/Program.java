package app;

import entities.Financing;

public class Program {

	public static void main(String[] args) {

		try {
			Financing financing = new Financing(100000.0, 2000.0, 20);
			System.out.println("Dados do financiamento 1: ");
			System.out.printf("Entrada: %.2f%n", financing.entry());
			System.out.printf("Prestação: %.2f%n", financing.quota());

		} catch (IllegalArgumentException e) {
			System.out.println("Erro no financiamento 1: " + e.getMessage());
		}

		try {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			System.out.println("Dados do financiamento 2: ");
			System.out.printf("Entrada: %.2f%n", financing.entry());
			System.out.printf("Prestação: %.2f%n", financing.quota());

		} catch (IllegalArgumentException e) {
			System.out.println("Erro no financiamento 2: " + e.getMessage());
		}
	}

}
