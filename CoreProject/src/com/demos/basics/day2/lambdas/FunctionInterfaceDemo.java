package com.demos.basics.day2.lambdas;

import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceDemo {

	public static void main(String[] args) {
		Supplier<Double> s=()->Math.PI;
		System.out.println(s.get());
		
		Consumer<String> c=str->System.out.println(str.length());
		c.accept("Lata");
		
		Predicate<String> p=str->str.length()>5;
		System.out.println(p.test("Lata"));
		
		Function<String,Character> f=str->str.charAt(0);
		System.out.println(f.apply("Lata"));
		
		
		System.out.println(p);

	}

}
