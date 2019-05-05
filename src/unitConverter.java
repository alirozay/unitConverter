import java.util.Scanner;

public class unitConverter {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("This is a unit converter.\nEnter the type of unit being entered:");
		String unit = key.nextLine();
		System.out.println("Now enter the unit you want to convert to:");
		String convert = key.nextLine();
		System.out.println("Now enter the value:");
		double value = key.nextDouble();
		cases(unit, convert, value);
	}
	
	public static void cases(String unit, String convert, double value) {
		switch(unit) {
		case "kg":
			casesKg(convert, value);
			break;
		case "g":
			casesG(convert, value);
			break;
		case "lbs":
			casesLbs(convert, value);
			break;
		case "C":
			casesC(convert, value);
			break;
		case "F":
			casesF(convert, value);
			break;
		case "K":
			casesK(convert, value);
			break;
		case "m3":
			casesM3(convert, value);
			break;
		case "cm3":
			casesCM3(convert, value);
			break;
		case "l":
			casesL(convert, value);
			break;
		case "USD":
		casesUSD(convert, value);
		break;
		case "CAD":
		casesCAD(convert, value);
		break;
		case "BDT":
		casesBDT(convert, value);
		break;
		}
		
		
		
	}
	
	public static void casesKg(String convert, double value) {
		double result;
		switch(convert) {
		case "g":
			result = value*1000.0;
			System.out.println(result);
			break;
		case "lbs":
			result = value*2.205;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesG(String convert, double value) {
		double result;
		switch(convert) {
		case "kg":
			result = value/1000.0;
			System.out.println(result);
			break;
		case "lbs":
			result = value/453.592;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesLbs(String convert, double value) {
		double result;
		switch(convert) {
		case "kg":
			result = value/ 2.205;
			System.out.println(result);
			break;
		case "g":
			result = value * 453.592;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesC(String convert, double value) {
		double result;
		switch(convert) {
		case "F":
			result = (value * (9.0/5.0) ) + 32;
			System.out.println(result);
			break;
		case "K":
			result = value + 273.15;
			System.out.println(result);
		}
	}

	public static void casesF(String convert, double value) {
		double result;
		switch(convert) {
		case "C":
			result = (value - 32.0) * (5.0/9.0);
			System.out.println(result);
			break;
		case "K":
			result = (value - 32.0) * (5.0/9.0) + 273.15;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesK(String convert, double value) {
		double result;
		switch(convert) {
		case "C":
			result = value - 273.15;
			System.out.println(result);
			break;
		case "F":
			result = (value - 273.15) * (9.0/5.0) + 32;
			System.out.println(result);
			break;
		}
	}

	public static void casesM3(String convert, double value) {
		double result;
		switch(convert) {
		case "cm3":
			result = value * 1000000.0;
			System.out.println(result);
			break;
		case "l":
			result = value * 1000.0;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesCM3(String convert, double value) {
		double result;
		switch(convert) {
		case "m3":
			result = value /1000000.0;
			System.out.println(result);
			break;
		case "l":
			result = value/1000.0;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesL(String convert, double value) {
		double result;
		switch(convert) {
		case "cm3":
			result = value * 1000.0;
			System.out.println(result);
			break;
		case "m3":
			result = value / 1000.0;
			System.out.println(result);
			break;
		}
	}

	public static void casesUSD(String convert, double value) {
		double result;
		switch(convert) {
		case "CAD":
			result = value * 1.35;
			System.out.println(result);
			break;
		case "BDT":
			result = value * 84.38;
			System.out.println(result);
			break;
		}
	}

	public static void casesCAD(String convert, double value) {
		double result;
		switch(convert) {
		case "USD":
			result = value / 1.35;
			System.out.println(result);
			break;
		case "BDT":
			result = value * 62.69;
			System.out.println(result);
			break;
		}
	}
	
	public static void casesBDT(String convert, double value) {
		double result;
		switch(convert) {
		case  "USD":
			result = value / 84.38;
			System.out.println(result);
			break;
		case "CAD":
			result = value / 62.69;
			System.out.println(result);
			break;
		}
	}
}
