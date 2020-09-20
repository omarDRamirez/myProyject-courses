package com.myProject.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ValidationTest {

	@Test
	public void testRutValidation1() {
		boolean validationReal = Validation.RutValidation("132448108");
		boolean validationTarget = true;
		assertEquals(validationReal, validationTarget);
	}	
		
	@Test
	public void testRutValidation2() {
		boolean validationReal = Validation.RutValidation("132448107");
		boolean validationTarget = false;
		assertEquals(validationReal, validationTarget);
	}	
		
	@Test
	public void testRutValidation3() {
		boolean validationReal = Validation.RutValidation("58386162");
		boolean validationTarget = true;
		assertEquals(validationReal, validationTarget);
	}	
		
	@Test
	public void testRutValidation4() {
		boolean validationReal = Validation.RutValidation("15506803-5");
		boolean validationTarget = true;
		assertEquals(validationReal, validationTarget);
	}	
		
	@Test
	public void testRutValidation5() {
		boolean validationReal = Validation.RutValidation("240433024");
		boolean validationTarget = false;
		assertEquals(validationReal, validationTarget);
	}	
		
			


}
