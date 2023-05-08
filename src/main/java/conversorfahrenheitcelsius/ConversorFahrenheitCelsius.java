package conversorfahrenheitcelsius;
import java.util.Scanner;
public class ConversorFahrenheitCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conversor converter = new Conversor();
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double grausF = input.nextDouble();
		
		double grausC = converter.fahrenheitToCelsius(grausF);
		System.out.printf("A temperadtura em Celsius e: %.2f", grausC);
		
input.close();
	}

}
