package co.cjpark.generic;

import co.cjpark.overloading.Calculator;

public class MainApp {
	public static void main(String[] args) {
		GenericTest<String> box = new GenericTest<String>();
		box.set("Hello");
		System.out.println(box.get());
		
		GenericTest<Integer> in = new GenericTest<Integer>();
		in.set(Integer.valueOf(5));
		System.out.println(in.get() + " + " + "10" + " = " + (in.get() + 10));
		
		///////////////////////////////////////////////////////////////
		
		Calculator calculator = new Calculator();
//		int n = calculator.sum(10, 20);
//		float sum = calculator.sum(10.4f, 21.1f);
		
//		System.out.println(n);
//		System.out.println(sum);
		
		///////////////////////////////////
		Gcalculator gc = new Gcalculator();
		int n = (int)gc.sum(20.0, 30.0);
		float sum = (float) gc.sum(21.5f, 30.4f);
		System.out.println(n);
		System.out.println(sum);
	}
}
