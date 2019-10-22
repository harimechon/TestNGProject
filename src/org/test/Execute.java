package org.test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Execute implements IRetryAnalyzer {
	int min=0 ,max =10;

	@Override
	public boolean retry(ITestResult arg0) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
	

}
