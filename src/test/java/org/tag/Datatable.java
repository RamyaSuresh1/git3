package org.tag;

import java.util.ArrayList;
import java.util.List;

public class Datatable {
	public static void main(String[] args) {
		List<ArrayList<String>>emp=new ArrayList <ArrayList<String>>();
	
ArrayList<String>a1=new ArrayList<String>();	
a1.add("sri");
a1.add("ram@1234");
ArrayList<String>a2=new ArrayList<String>();
a2.add("ram");
a2.add("ram@123");
emp.add(a1);
emp.add(a2);
ArrayList<String>data=emp.get(0);
String string=data.get(0);
System.out.println(string);

	}

}
