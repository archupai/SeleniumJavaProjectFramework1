package cucumberTest.cucumberTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class JunitTestExample {
	
	public String msg1 ="Testing JUnit Ignore annotations";	
	public String msg2= "Testing annotations at second level\n";

    DisplayMessage junitmsg = new DisplayMessage(msg1,msg2);							

    @Ignore
    @Test		
    public void testJUnitMsg() {					

        System.out.println("\nJunit Good Morning Message is displayed");					
        assertEquals(msg1, junitmsg.printGoodMorningMessage());					

    }		
    @Ignore
    @Test		
    public void testGoodEveningMsg() {					
        msg2="Good Evening !" +msg2;							
        System.out.println("\nJunit Good Evening Message is displayed ");					
        assertEquals(msg2, junitmsg.printGoodEveningMessage());					

    }		

}
