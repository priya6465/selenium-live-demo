package com.qa.tests;

import org.testng.annotations.Test;

public class Groupstestcases {

	@Test(groups={"sanityTest"})
	public void LoginTest_verifytitle() {
		System.out.println("title verifyed");
	}
	@Test(groups={"smokeTest"})
	public void LoginTest_verifylogo() {
		System.out.println("logo verifyed");
	}
	@Test(groups="smokeTest")
	public void LoginTest_verifyimage() {
		System.out.println("image verifyed");
	}
	@Test(groups="smokeTest")
	public void HomeTest_verifytitle() {
		System.out.println("title verifyed");
	}
	@Test(groups="sanityTest")
	public void HomeTest_verifylogo() {
		System.out.println("title verifyed");
	}
	
	@Test(groups="sanityTest")
	public void HomeTest_verifyfooter() {
		System.out.println("title verifyed");
	}

	}
