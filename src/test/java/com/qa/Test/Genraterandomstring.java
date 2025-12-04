package com.qa.Test;

import org.apache.commons.lang3.RandomStringUtils;

public class Genraterandomstring {

	public static void main(String[] args) {

 String randomString = RandomStringUtils.secure().nextAlphabetic(6);//how many character we should want give the number
 System.out.println(randomString);
 
 
 
 String randomString1 = RandomStringUtils.secure().nextNumeric(6); //how many degits we should wnat
 System.out.println(randomString1);
	}

}
