package com.nttdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mainmarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Markslist> l=new ArrayList<>();
l.add(new Markslist("peter","computer networks",78));
l.add(new Markslist("rahul","computer networks",97));
l.add(new Markslist("pankaj","computer networks",88));
l.add(new Markslist("john","computer networks",98));
l.add(new Markslist("warner","computer networks",87));
l.add(new Markslist("james","computer networks",75));


//List<Integer>m =new ArrayList<>();
List<Integer> i=l.stream().filter(p->p.marks>80).map(p->p.marks).collect(Collectors.toList());
System.out.println(i);

Stream.iterate(1, e->e+1).filter(e->e*2>0).limit(3).forEach(System.out::println);
Optional<Integer> l1 =l.stream().map(p->p.marks).reduce((sum,marks)->(sum+marks));
//Optional<Integer> l2= l.stream().map(p->p.marks).reduce((sum,marks)->(sum+marks));
System.out.println(l1);
	}

}
