package com.kitri.fpgw.util;

public class StringClass {

	public StringClass() {
	}

	/**�۾� ID ����**/
	public static String NewWorkIDCreate(){
		
		return Integer.toString((int)(Math.random() * 1000000000));
	}
	
	
}
