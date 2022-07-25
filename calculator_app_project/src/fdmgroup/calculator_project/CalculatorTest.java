package fdmgroup.calculator_project;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator_Logic cal;

	@BeforeEach
	public void init() {
		cal = new Calculator_Logic();
	}

	@Test
	@DisplayName("Test input")
	public void testEvaluateReturnsDoubleFourWhenStringFourIsPassedIn() {
		String expression = "4";
		assertEquals(4.0, cal.evaluate(expression), 0.0);
	}

	@Test
	@DisplayName("Test input2")
	public void testEvaluateReturnsDoubleFiveWhenStringFiveIsPassedIn() {
		String expression = "5";
		assertEquals(5.0, cal.evaluate(expression), 0.0);
	}
	
	@Test
	@DisplayName("Test plus")
	public void testEvaluateReturnsDoubleFourWhenStringTwoPlusTwoIsPassedIn() {
		String expression = "2+2";
		assertEquals(4.0, cal.evaluate(expression), 0.0);
	}
	@Test
	@DisplayName("Test plus2")
	public void testEvaluateReturnsDoubleFiveWhenStringTwoPlusThreeIsPassedIn() {
		String expression = "2+3";
		assertEquals(5.0, cal.evaluate(expression), 0.0);
	}
	@Test
	@DisplayName("Test multiplePlus")
	public void testEvaluateReturnsDoubleTenWhenStringTwoPlusThreePlusFiveIsPassedIn() {
		String expression = "2+3+5";
		assertEquals(10.0, cal.evaluate(expression), 0.0);
	}
	@Test
	@DisplayName("Test multipleTimes")
	public void testEvaluateReturnsDoubleTwentyWhenStringTwoTimesTwoTimesFiveIsPassedIn() {
		String expression = "2*2*5";
		assertEquals(20.0, cal.evaluate(expression), 0.0);
	}
	@Test
	@DisplayName("Test multipleDivide")
	public void testEvaluateReturnsDoubleFiveWhenStringTwoDivideTwoTimesFiveIsPassedIn() {
		String expression = "2/2* 5";
		assertEquals(5.0, cal.evaluate(expression), 0.0);
	}
	@Test
	@DisplayName("Test multipleOperators")
	public void testEvaluateReturnsDoubleWhenStringIsPassedIn() {
		String expression = "6 * 8 / 7 + 6 - 9 + 5 / 4 * 3 - 8 + 6 ";
		assertEquals(5.6, cal.evaluate(expression), 0.0);
	}
	
	@Test
	@DisplayName("Test multipleOperators2.0")
	public void testEvaluateReturnsDoubleWhenStringIsPassedIn2() {
		String expression = "6 - 8 + 7 / 6 * 9 - 5 * 4 - 3 + 8 / 6 ";
		assertEquals(-13.2, cal.evaluate(expression), 0.0);
	}

}
