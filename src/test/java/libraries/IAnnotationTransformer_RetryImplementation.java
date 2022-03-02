package libraries;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class IAnnotationTransformer_RetryImplementation implements IAnnotationTransformer {

	public void transform( ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	
		annotation.setRetryAnalyzer(IRetryAnalyzerImplementation.class);
		
		String testCase=testMethod.getName();
		
		if(testCase.equals("browserInvoke")) {
			annotation.setPriority(1);
		}else if(testCase.equals("browserClose")) {
			annotation.setPriority(2);
		}
	}
}