package com.qa.Test;

import java.util.HashMap;

public class charocc {

	public static void main(String[] args) {

String  s="automation";
s=s.replaceAll("//s+","");
char[]arr=s.toCharArray();
HashMap<Character,Integer>map=new HashMap<>();
for(int i=0;i<arr.length;i++) {
	int count=0;
	for(int j=0;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
		}
	}
	map.put(arr[i], count);
}
System.out.println(map);


	}

}
