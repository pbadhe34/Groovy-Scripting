package com.data.test;

import com.server.User;

public class TestJavaAccess {

	public static void main(String[] args) {
		User obj2 = new User();

		obj2.update();
	//	obj2.accessInSubClass(); //no access ouside the package

	//	obj2.dataTest();//private not accessible
		
		obj2.testDefault();

	}

}
