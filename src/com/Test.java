package com;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Driver d1 = new Driver("bus",101,"jhon",100);
		Driver d2 = new Driver("bus",102,"don",1000);
		
		ArrayList al = new ArrayList();
		al.add(d1);
		al.add(d2);
		
		Travel t1 = new Travel();
		System.out.println(t1.isCarDriver(d1));
		System.out.println(t1.retrivebyDriver(al, 102));
		System.out.println(t1.retriveCountOfDriver(al, "bus"));
		System.out.println(t1.retriveDriver(al, "Jhon"));
		System.out.println(t1.retriveMaximumDistanceTravelledDriver(al));
	}

}
