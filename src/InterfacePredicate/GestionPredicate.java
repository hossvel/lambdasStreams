package InterfacePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GestionPredicate {

	public List<Integer> calc(Predicate<Integer> p1, List<Integer> lista) {

		List<Integer> resp =  new ArrayList<>();
		for (Integer x : lista) {
			if(p1.test(x))
				resp.add(x);
		}
		return resp;
	}

}
