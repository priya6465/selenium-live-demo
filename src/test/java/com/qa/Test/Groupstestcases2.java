package com.qa.Test;

import org.testng.annotations.Test;

public class Groupstestcases2 {

	@Test(groups={"sanityTest"})
	public void LoginTest_verifytitle() {
		System.out.println("title verifyed");
	}
	@Test(groups={"smokeTest"})
	public void LoginTest_verifylogo() {
		System.out.println("title verifyed");
	}
	@Test(groups="sanity")
	public void LoginTest_verifyimage() {
		System.out.println("title verifyed");
	}
	@Test(groups="smoke")
	public void HomeTest_verifytitle() {
		System.out.println("title verifyed");
	}
	@Test(groups="sanity")
	public void HomeTest_verifylogo() {
		System.out.println("title verifyed");
	}
	
	@Test(groups="sanity")
	public void HomeTest_verifyfooter() {
		System.out.println("title verifyed");
	}

	}
