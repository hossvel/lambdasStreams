package InterfacePredicate;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MainPredicate {

	public static void main(String[] args) {

		Predicate<Integer> p1 = (t)->t>2;
		System.out.println(p1.test(6));

		System.out.println("Pares");
		GestionPredicate g1 = new GestionPredicate();
		List<Integer> lista = List.of(1,2,3,4,5,6,7,8);
		List<Integer> resp = g1.calc((t)->(t%2==0), lista);
		for (Integer x : resp) {
			System.out.println(x);
		}
		
		System.out.println("Mayores a 5");
		List<Integer> lista1 = List.of(1,2,3,4,5,6,7,8);
		List<Integer> resp1 = g1.calc((t)->(t>5), lista1);
		for (Integer x : resp1) {
			System.out.println(x);
		}
		
		System.out.println("MENOR");
		Predicate<Integer> p2 = (t)->t>2;
		System.out.println(p2.negate().test(6));
		
		///bipredicate
		
		BiPredicate<Integer,Integer> b1 = (t,r)->t>r;
		System.out.println(b1.test(6,5));
		
		//or
		System.out.println("OROR");
		List<Integer> listapp = List.of(1,2,3,4,5,6,7,8,11,17,9);
		
		Predicate<Integer> pp3 = (t)->(t%3==0);
		Predicate<Integer> pp5 = (t)->(t>5);
		Predicate<Integer> ppunion = pp3.or(pp5);
		
		
		List<Integer> rppunion = g1.calc(ppunion, listapp);
		for (Integer x : rppunion) {
			System.out.println(x);
		}
	}

}
