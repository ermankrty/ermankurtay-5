package com.assignment5.ermankurtay;

public class main {

	public static void main(String[] args) {

		
		CustomArrayList<Integer> obj = new CustomArrayList<Integer>();
		
		obj.add(5);
		
		obj.add(10);
		
		obj.add(15);

		obj.add(20);

		obj.add(25);

		obj.add(30);

		obj.add(35);

		obj.add(40);

		obj.add(45);

		obj.add(50);

		obj.add(55);

		
		System.out.println(obj.get(0));
		
		System.out.println(obj.get(1));
		
		System.out.println(obj.get(10));
		
		System.out.println(obj.getSize());


	}

}
