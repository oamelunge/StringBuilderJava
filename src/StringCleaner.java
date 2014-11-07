public class StringCleaner {

	public static char _delimiter;
	public StringCleaner() {
		super();
	}

	public static String[] splitStringWithFoundDelimetator(String stringToCheck) {
		stringToCheck = cleanCarReturn(stringToCheck);
		return splitSringNumbers(stringToCheck);
	}

	private static String[] splitSringNumbers(String stringToCheck) {
		return stringToCheck.split(String.valueOf(_delimiter));
	}

	private static String cleanCarReturn(String stringToCheck) {	
		return stringToCheck.replace('\n', _delimiter);
	}

	public static String checkDelimitation(String stringToCheck) {
		_delimiter=',';		
		if(stringToCheck.startsWith("//"))
		{
			setDelimiter(stringToCheck);
			return stringToCheck=stringToCheck.substring(4);
		}
		return stringToCheck;
	}	

	public static boolean isEmptyString(String stringToCheck) {
		return stringToCheck.isEmpty();
	}

	public static int parseStringToNumber(String stringToCheck) {
		return Integer.parseInt(stringToCheck);
	}
	
	private static void setDelimiter(String stringToCheck) {
		_delimiter=stringToCheck.charAt(2);
	}

}