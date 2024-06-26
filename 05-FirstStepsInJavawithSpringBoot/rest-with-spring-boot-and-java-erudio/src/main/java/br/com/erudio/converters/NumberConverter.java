package br.com.erudio.converters;

public class NumberConverter {
	
	public static Double convertToDouble(String strNumber) {
		// TODO Auto-generated method stub
		if(strNumber == null) return 0D;
		
		String number = strNumber.replace(",", ".");
		if(isNumeric(number)) return Double.parseDouble(number);
		return 0D;
	}
	
	public static boolean isNumeric(String strNumber) {
		if(strNumber == null) return false;
		String number = strNumber.replace(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
	
}
