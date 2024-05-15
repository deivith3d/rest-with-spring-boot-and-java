package br.com.deivith3d.converters;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) {
		// TODO Auto-generated method stub
    	if(strNumber == null) return 0D;
    	String number = strNumber.replaceAll(",", ".");
    	if(isNumeric(number)) return Double.parseDouble(number);
    	return 0D;
	}

    public static boolean isNumeric(String strNumber) {
		// TODO Auto-generated method stub
		if(strNumber == null) return false;
    	String number = strNumber.replaceAll(",", ".");
		return number.matches("[-+]?[0-9]*\\.?[0-9]");
	}
}
