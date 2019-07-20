package cucumberTest.cucumberTest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {									
	      Result output = JUnitCore.runClasses(JunitTestExample.class);				
				for (Failure fail : output.getFailures()) {							
	         System.out.println(fail.toString());					
	      }		
	      System.out.println("Result=="+output.wasSuccessful());							
	   }		

}
