import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import conversorfahrenheitcelsius.Conversor;

class ConversorFahrenheitCelsiusTeste {
	@Test
	void testeconversor() {
		Conversor converter = new Conversor();

		double grausF = 50;
		double grausC = converter.fahrenheitToCelsius(grausF);

		assertEquals(10,00 , grausC);
	}

}
