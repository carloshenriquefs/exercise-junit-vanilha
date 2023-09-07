package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void constructorShouldCreateObjectWhenValidData() {

		Financing financing = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(100000.0, financing.getTotalAmount());
		Assertions.assertEquals(2000.0, financing.getIncome());
		Assertions.assertEquals(80, financing.getMonths());
	}

	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
		});

	}

	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {

		Financing financing = new Financing(100000.0, 2000.0, 80);

		financing.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, financing.getTotalAmount());

	}

	@Test
	public void setTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setTotalAmount(150000.0);
		});
	}

	@Test
	public void setIncomeShouldSetDataWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);

		financing.setIncome(2100.0);

		Assertions.assertEquals(2100.0, financing.getIncome());
	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
			financing.setIncome(1900.0);
		});
	}

	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		Financing financing = new Financing(100000.0, 2000.0, 80);

		financing.setMonths(81);

		Assertions.assertEquals(81, financing.getMonths());
	}

	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 80);
			financing.setMonths(79);
		});
	}

	@Test
	public void entryShouldCalculateEntryCorrectly() {
		Financing financing = new Financing(100000.0, 2000.0, 80);

		Double entry = financing.entry();

		Assertions.assertEquals(20000, entry);
	}

	@Test
	public void shouldReturnsEntryThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
			financing.entry();
		});
	}

	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing financing = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(1000, financing.quota());
	}

	@Test
	public void shouldReturnsQuotaThrowIllegalArgumentExceptionWhenInvalidData() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing financing = new Financing(100000.0, 2000.0, 20);
			financing.quota();
		});
	}
}
