package interfacesfuncionales;

import java.util.function.Function;

public class TestFunction {

	public static void main(String[] args) {
	
		Function<Integer,String> f1 = (t) -> Integer.toString(t);
		
		 System.out.println(f1.apply(5));
	}

}
