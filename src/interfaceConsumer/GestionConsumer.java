package interfaceConsumer;

import java.util.List;
import java.util.function.Consumer;

public class GestionConsumer {

	public void calc(Consumer<Integer> c1, List<Integer> lista) {

		for (Integer x : lista) {
			c1.accept(x);
		}
	}
	public void calc1(Consumer<Estudiante> c1, List<Estudiante> lista) {

		for (Estudiante e1 : lista) {
			c1.accept(e1);
		}
	}
}
