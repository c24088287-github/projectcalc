package firstproject.projectcalc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class Calculatortest {
	@Test		
    public void testAssert(){		
		 assertNotNull();	}
	
        		

	private void assertNotNull() {
		// TODO Auto-generated method stub
		
	}



	@Test
	public void testadd() {
    Calculator check =new Calculator();
    
    assertEquals("4+4 should be 8",8,check.add(4, 4));

	}
	@Test
	public void testsub() {
    Calculator check =new Calculator();
    assertEquals("4-4 should be 0",0,check.sub(4, 4));

	}
	@Test
	public void testmul() {
    Calculator check =new Calculator();
    assertEquals("4*4 should be 16",16,check.mul(4, 4));

	}


}
