package co.com.processData;

import org.junit.Test;
import junit.framework.TestCase;
import processData.ProcessDataFile;

public class SearchCelebrityTest extends TestCase {
	
	@Test
	public void initProcessTest() {
		
		ProcessDataFile initProcess = new ProcessDataFile();
		boolean result=false;
		String [] paramArray = {"FALSE","FALSE","FALSE"};
		result=initProcess.verifyArrayContent(paramArray);
		assertTrue("Result Validation method verifyArrayContent", result);
		
	}
	
	

}
