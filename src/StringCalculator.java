
public class StringCalculator  {


	String _stringToCalculate;

	public StringCalculator(String stringToCalculate) {		
		super();
		_stringToCalculate=stringToCalculate;
		
	}

	protected int getValue() {				
		
		if (StringCleaner.isEmptyString(_stringToCalculate))
			return 0;		
		
		_stringToCalculate=StringCleaner.checkDelimitation(_stringToCalculate);			
			
		return sumNumbers();	
		
	}

	private int sumNumbers() {
		int _sum2 = 0;
		for(String numInString : StringCleaner.splitStringWithFoundDelimetator(_stringToCalculate)) 
			_sum2 += StringCleaner.parseStringToNumber(numInString);
		
		return _sum2;
	}

}