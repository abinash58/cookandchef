package com.cookandchef.qa.util;

import com.cookandchef.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public void switchToFrame() {
		driver.switchTo().frame("");
	}

}
