import org.junit.Test;
import static org.junit.Assert.*;

//import org.junit.runner.RunWith;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;

//import static org.mockito.Mockito.*;
//import org.powermock.api.mockito.PowerMockito.withNew;
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(Maventest.class)
public class Jtest1 {
	
	@Test
	public void testMain() {
		String[] args = {"1"};
		Maventest.main(args);		
	}
	
	@Test
	public void testDefaultArguments(){
		String [] args = {};
		Maventest.main(args);
	}
	
	/*@Test
	public void testWrongArgument() {
		String [] args = {"Vikas"};
		Maventest.main(args);
		//PowerMockito.mockStatic(System.class);
		//PowerMockito.staticVerify(only());
		//System.exit(Maventest.EXIT_STATUS_PARAMETER_TYPE_WRONG);		
	};*/
	@Test
	public void testForTrueEnteredValueCheck(){
		Maventest testObj = new Maventest();
		String retVal = testObj.EnteredValueCheck(1);
		assertEquals("true", retVal);
	}
	
	@Test
	public void testForFalseEnteredValueCheck(){
		Maventest testObj = new Maventest();
		String retVal = testObj.EnteredValueCheck(2);
		assertEquals("false", retVal);
	}	
}
