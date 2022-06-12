package tempConversion;

import java.util.Scanner;

public class User_Page {

	static Formulas_For_Converting Formulas = new Formulas_For_Converting();

	public static String showList() {

		Scanner sc = new Scanner(System.in);

		System.out.println("\nType a single number (from 1 - 6) of your desired option to convert to:\n\n"
				+ "#1 Celsius    -> Fahrenheit\n\n" + "#2 Kelvin     -> Fahrenheit\n\n" + "#3 Fahrenheit -> Celsius\n\n"
				+ "#4 Kelvin     -> Celsius\n\n" + "#5 Fahrenheit -> Kelvin\n\n" + "#6 Celsius    -> Kelvin\n\n"
				+ "IF YOU WOULD LIKE TO EXIT, Type the Keyword: 'esc' in any case!");

		System.out.println();

		String option = sc.nextLine();

		return option;
	}

	public static void chooseOptions() {

		String option = showList();

		switch (option.toLowerCase()) {
        //
		case "1":
			Case1();
			break;

		case "2":
			Case2();
			break;

		case "3":
			Case3();
			break;

		case "4":
			Case4();
			break;

		case "5":
			Case5();
			break;

		case "6":
			Case6();
			break;

		case "esc":
			esc();
			break;

		default:
			chooseOptions();
		}
	}

////////////////////////////////////////////////
	public static void Case1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the keyword 'menu' to go back to the list"
				+ "\ntype the keyword 'esc' to close the application\n"
				+ "\nType the amount of Celsius would you like to convert to Fahrenheit:\n");
		String input = sc.nextLine();

		switch (input.toLowerCase()) {
		case "menu":
			chooseOptions();
			break;
		case "esc":
			esc();
			break;
		}

		try {

			double celsius = Double.parseDouble(input);
			double fahrenheit = Formulas.Celsius_To_Fahrenheit(celsius);
			int roundedFahrenheit = (int) (Math.round(fahrenheit));

			System.out.println("\n" + celsius + " degrees celsius is converted to " + fahrenheit
					+ " degrees fahrenheit.\n" + "The rounded value is about " + roundedFahrenheit
					+ " degrees fahrenheit. Here is the menu again:");
			chooseOptions();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid amount of celsius.\n");
		} finally {
			Case1();
		}
	}

/////////////////////////////////////////////////////
	public static void Case2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the keyword 'menu' to go back to the list"
				+ "\ntype the keyword 'esc' to close the application\n"
				+ "\nType the amount of Kelvin would you like to convert to Fahrenheit:\n");
		String input = sc.nextLine();

		switch (input.toLowerCase()) {
		case "menu":
			chooseOptions();
			break;
		case "esc":
			esc();
			break;
		}

		try {

			double kelvin = Double.parseDouble(input);
			double fahrenheit = Formulas.Kelvin_To_Fahrenheit(kelvin);
			int roundedFahrenheit = (int) (Math.round(fahrenheit));

			System.out.println("\n" + kelvin + " degrees kelvin is converted to " + fahrenheit
					+ " degrees fahrenheit.\n" + "The rounded value is about " + roundedFahrenheit
					+ " degrees fahrenheit. Here is the menu again:");
			chooseOptions();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid amount of kelvin.\n");
		} finally {
			Case2();
		}
	}

	////////////////////////////////////////////////////
	public static void Case3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the keyword 'menu' to go back to the list"
				+ "\ntype the keyword 'esc' to close the application\n"
				+ "\nType the amount of Fahrenheit would you like to convert to Celsius:\n");
		String input = sc.nextLine();

		switch (input.toLowerCase()) {
		case "menu":
			chooseOptions();
			break;
		case "esc":
			esc();
			break;
		}

		try {

			double fahrenheit = Double.parseDouble(input);
			double celsius = Formulas.Fahrenheit_To_Celsius(fahrenheit);
			int roundedCelsius = (int) (Math.round(celsius));

			System.out.println("\n" + fahrenheit + " degrees fahrenheit is converted to " + celsius
					+ " degrees celsius.\n" + "The rounded value is about " + roundedCelsius
					+ " degrees celsius. Here is the menu again:");
			chooseOptions();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid amount of fahrenheit.\n");
		} finally {
			Case3();
		}
	}

	////////////////////////////////////////////////////////////////////
	public static void Case4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the keyword 'menu' to go back to the list"
				+ "\ntype the keyword 'esc' to close the application\n"
				+ "\nType the amount of Kelvin would you like to convert to Celsius:\n");
		String input = sc.nextLine();

		switch (input.toLowerCase()) {
		case "menu":
			chooseOptions();
			break;
		case "esc":
			esc();
			break;
		}

		try {

			double kelvin = Double.parseDouble(input);
			double celsius = Formulas.Kelvin_To_Celsius(kelvin);
			int roundedCelsius = (int) (Math.round(celsius));

			System.out.println("\n" + kelvin + " degrees kelvin is converted to " + celsius + " degrees celsius.\n"
					+ "The rounded value is about " + roundedCelsius + " degrees celsius. Here is the menu again:");
			chooseOptions();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid amount of kelvin.\n");
		} finally {
			Case4();
		}
	}

	///////////////////////////////////////////////////
	public static void Case5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the keyword 'menu' to go back to the list"
				+ "\ntype the keyword 'esc' to close the application\n"
				+ "\nType the amount of Fahrenheit would you like to convert to Kelvin:\n");
		String input = sc.nextLine();

		switch (input.toLowerCase()) {
		case "menu":
			chooseOptions();
			break;
		case "esc":
			esc();
			break;
		}

		try {

			double fahrenheit = Double.parseDouble(input);
			double kelvin = Formulas.Fahrenheit_To_Kelvin(fahrenheit);
			int roundedKelvin = (int) (Math.round(kelvin));

			System.out.println("\n" + fahrenheit + " degrees fahrenheit is converted to " + kelvin
					+ " degrees kelvin.\n" + "The rounded value is about " + roundedKelvin
					+ " degrees kelvin. Here is the menu again:");
			chooseOptions();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid amount of fahrenheit.\n");
		} finally {
			Case5();
		}
	}

	//////////////////////////////////////////////////
	public static void Case6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nType the keyword 'menu' to go back to the list"
				+ "\ntype the keyword 'esc' to close the application\n"
				+ "\nType the amount of Celsius would you like to convert to Kelvin:\n");
		String input = sc.nextLine();

		switch (input.toLowerCase()) {
		case "menu":
			chooseOptions();
			break;
		case "esc":
			esc();
			break;
		}

		try {

			double celsius = Double.parseDouble(input);
			double kelvin = Formulas.Celsius_To_Kelvin(celsius);
			int roundedKelvin = (int) (Math.round(kelvin));

			System.out.println("\n" + celsius + " degrees celsius is converted to " + kelvin + " degrees kelvin.\n"
					+ "The rounded value is about " + roundedKelvin + " degrees kelvin. Here is the menu again:");
			chooseOptions();
		} catch (Exception e) {
			System.out.println("\nPlease enter a valid amount of celsius.\n");
		} finally {
			Case6();
		}
	}

	///////////////////////////////////////////////////////////
	public static void esc() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"\nYou have exited the application\n");
		String input = sc.nextLine();

		if (input.equalsIgnoreCase("start")) {
			chooseOptions();
		} else {
			esc();
		}
	}
}
