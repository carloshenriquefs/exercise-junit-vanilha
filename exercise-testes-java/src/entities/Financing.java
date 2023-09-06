package entities;

public class Financing {

	private Double totalAmount;
	private Double income;
	private Integer months;

	public Financing(Double totalAmount, Double income, Integer months) {
		validationFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
		this.income = income;
		this.months = months;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		validationFinancing(totalAmount, income, months);
		this.totalAmount = totalAmount;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		validationFinancing(totalAmount, income, months);
		this.income = income;
	}

	public Integer getMonths() {
		return months;
	}

	public void setMonths(Integer months) {
		validationFinancing(totalAmount, income, months);
		this.months = months;
	}

	public Double entry() {
		return totalAmount * 0.2;
	}

	public Double quota() {
		return (totalAmount - entry()) / months;
	}

	public void validationFinancing(double totalAmount, double income, Integer months) {
		if (totalAmount * 0.8 / months > income / 2.0) {
			throw new IllegalArgumentException("A parcela não pode ser maior que a metade da renda");
		}
	}

}
