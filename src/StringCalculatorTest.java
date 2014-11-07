import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalculatorTest  {
    private StringCalculator stringCalculator;
	
	@Test
	public void emptyStringShouldReturn0() {
		stringCalculator = new StringCalculator("");
		assertEquals(0,stringCalculator.getValue());
	}
	
	@Test
	public void whenPassing1CharacterShouldReturTheNumber()
	{		
		stringCalculator = new StringCalculator("1");
		assertEquals(1,stringCalculator.getValue());
	}
	
	@Test
	public void whenPassing2CharactersWithCommaSeparatorShoutReturnSum()
	{
		stringCalculator = new StringCalculator("1,2");
		assertEquals(3,stringCalculator.getValue());
	}
	
	@Test
	public void whenPassinMoreThanThoCharactersWithCommaSeparatorShouldReturnSum()
	{
		stringCalculator = new StringCalculator("1,2,3,4,5");
		assertEquals(15,stringCalculator.getValue());
	}
	@Test
	public void AlloCarrRegurnInsteadOfComma()
	{
		stringCalculator = new StringCalculator("1\n2,3");
		assertEquals(6,stringCalculator.getValue());
	}
	
	@Test
	public void SupportCustomdelimiter()
	{
		stringCalculator = new StringCalculator("//;\n1;2;3;4");
		assertEquals(10,stringCalculator.getValue());
		
	}

}
