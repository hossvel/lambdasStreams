package interfacesfuncionales;

import java.util.function.BiFunction;

public class GestionFuncional {

	public int Calc (BiFunction<Integer, Integer, Integer> bi, Integer a,Integer b) {
		return bi.apply(a, b);

	} 
}
