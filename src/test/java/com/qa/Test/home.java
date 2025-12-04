package com.qa.Test;

import org.testng.annotations.Test;

public class home {
	@Test(priority=2)
	public void m3() {
		System.out.println("this is m3 method of home class");
	}
	@Test(priority=3)
	public void m4() {
		System.out.println("this is m4 method of home class");
	}

}
