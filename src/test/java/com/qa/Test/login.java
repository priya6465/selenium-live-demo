package com.qa.Test;

import org.testng.annotations.Test;

public class login {
	@Test(priority=4)
	public void m1() {
		System.out.println("this is m1 method of login class");
	}
	@Test(priority=1)
	public void m2() {
		System.out.println("this is m2 method of login class");
	}
	@Test(priority=1)
	public void m3() {
		System.out.println("this is m3 method of login class");
	}
	
	@Test(priority=1)
	public void m4() {
		System.out.println("this is m4 method of login class");
	}
<<<<<<< HEAD
		@Test(priority=1)
		public void m5() {
			System.out.println("this is m5 method of login class");
		}
		
		@Test(priority=1)
		public void m6() {
			System.out.println("this is m6 method of login class");
		}
=======
	@Test(priority=1)
	public void m5() {
		System.out.println("this is m5 method of login class");
	}


>>>>>>> 799358dbf12f0f6a86d35844242370779374e43c
}
