package com.nttdata;

import java.util.function.Function;
import java.util.function.Predicate;

public class Predicateexample {

	public static void main(String[] args) {
		Predicate<Integer>p=I->(I>78);                      // it will always return boolean value
System.out.println("predicate " + p.test(90));
System.out.println("predicate " + p.test(30));
Predicate<String> p1=S->(S.length()>5);
System.out.println(p1.test("good afternoon"));
                                  //Function<T, R>    here in function interface T is the type of input argument and R is the return type argument
Function < String,Integer> f =s->s.length();       // and lambda expression is assigned to an object of function type
System.out.println(f.apply("java session"));
Predicate<Integer>p2=E->(E<6);
System.out.println("predicate" +p2.test(4));
Function<Integer, Integer> f1=a->(a+100);
System.out.println("function is " +f1.apply(100));
	}

}
