package cucumberTest.cucumberTest;

//import org.junit.runner.JUnitCore;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class SampleTest {
public static void main(String[] args) {
	Result output=JUnitCore.runClasses(TestExampleSuite.class);
	
	for(Failure fail:output.getFailures()){
		System.out.println(fail.toString());
	}
System.out.println(output.wasSuccessful());
}
}
