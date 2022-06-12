package tempConversion;

public class Formulas_For_Converting {

	// Converting to Fahrenheit:
	public double Celsius_To_Fahrenheit(double celsius) {
		double fahrenheit = (1.8 * celsius) + 32;
		return fahrenheit;
	}

	public double Kelvin_To_Fahrenheit(double kelvin) {
		double fahrenheit = ((kelvin - 273.15) * 1.8) + 32;
		return fahrenheit;
	}

	//////////////////////////////

	// Converting to Celsius:
	public double Fahrenheit_To_Celsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}

	public double Kelvin_To_Celsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}

	//////////////////////////////

	// Converting to Kelvin:
	public double Fahrenheit_To_Kelvin(double fahrenheit) {
		double kelvin = ((fahrenheit - 32) / 1.8) + 273.15;
		return kelvin;
	}

	public double Celsius_To_Kelvin(double celsius) {
		double kelvin = celsius + 273.15;
		return kelvin;
	}

	//////////////////////////////
}
