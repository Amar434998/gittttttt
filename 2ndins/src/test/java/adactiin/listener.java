package adactiin;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class listener implements IAnnotationTransformer {

	
	public void transform(ITestAnnotation ak, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer retry= ak.getRetryAnalyzer();
		if(retry==null) {
			ak.setRetryAnalyzer(faild.class);
		}
		
	}

}
