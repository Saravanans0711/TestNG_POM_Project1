package libraries;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerImplementation implements IRetryAnalyzer {
	
	int iCount=0;
	int iMaxCount=5;

	@Override
	public boolean retry(ITestResult result) {
		System.out.println("Retry method name is:"+result.getName());
		if(iCount<iMaxCount) {
			iCount++;
			return true;
		}
		return false;
	}
}