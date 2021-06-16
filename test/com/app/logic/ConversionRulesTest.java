package test.com.app.logic;

/**
 * Maria Calestino
 * June 16, 2021
 */

import main.com.app.logic.ConversionRules;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Tests the conversion
 * @author mariacalestino
 *
 */
public class ConversionRulesTest {

	protected Character[] characterArray;
	protected Character character;

	@Before
	public void setUp() throws Exception {
		character = 'P';
		characterArray = new Character[]{'I','X','V','L'};

	}

	@Test
	public void testOutputFormatter(){
		boolean result = ConversionRules.checkIfLiteralPresent(characterArray, character);
		Assert.assertEquals(false, result);
	}

	@Test
	/**
	 * Test whether the subtraction logic is handled correctly.
	 */
	public void testSubtractionLogic(){
		float result = ConversionRules.subtractionLogic(52f, 10f, 50f);
		Assert.assertEquals(42f, result, 00.00);
	}
}
