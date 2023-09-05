package interfacesfuncionales;

import java.util.function.BiFunction;

public  class TestBifunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionFuncional g1 = new GestionFuncional();
		
		//Example01
		BiFunction<Integer,Integer,String> f1 = (t,u) -> Integer.toString(t).concat(Integer.toString(u));
		System.out.println(f1.apply(5,8));
		
		//example02
		System.out.println(g1.Calc((t,u) -> t+u , 8, 4));
		System.out.println(g1.Calc((t,u) -> t-u , 8, 4));
		System.out.println(g1.Calc((t,u) -> t*u , 8, 4));
		System.out.println(g1.Calc((t,u) -> t/u , 8, 4));
	}

}
