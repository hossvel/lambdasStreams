package optional;

import java.util.Optional;

public class MainOptional {

	private static Optional<Estudiante> obtenerPorEmail(String email) {
		Optional<Estudiante> e1 = new ServiceEstudiante().ObtenerporEmail(email);
		Optional<Estudiante> e2 = new ServiceEstudianteAlternative().ObtenerporEmail(email);

		return e1.or(()->e2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Optional<Estudiante> eoptional = MainOptional.obtenerPorEmail("e2");
		eoptional.ifPresent(x -> System.out.println(x));

		Optional<Estudiante> eoptional1 = MainOptional.obtenerPorEmail("e8");
		eoptional1.ifPresentOrElse(x -> System.out.println(x),() -> System.out.println("No se encontro")); 

		Estudiante eoptional2 = MainOptional.obtenerPorEmail("e3").orElse(new ServiceEstudiante().getDefault());
		System.out.println(eoptional2);

		Estudiante eoptional3 = MainOptional.obtenerPorEmail("e7").orElseGet(() -> new ServiceEstudiante().getDefault());
		System.out.println(eoptional3);
	
		Estudiante eoptional4 = MainOptional.obtenerPorEmail("ea2").orElseGet(() -> new ServiceEstudiante().getDefault());
		System.out.println(eoptional4);
	}

}
