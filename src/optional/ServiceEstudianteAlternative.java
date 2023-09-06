package optional;

import java.util.List;
import java.util.Optional;


public class ServiceEstudianteAlternative {

	public Optional<Estudiante> ObtenerporEmail(String email) {

		return ServiceEstudianteAlternative.getdata()
				.stream()
				.filter(x -> x.getEmail().equals(email)).findFirst();
	}

	private static List<Estudiante> getdata(){

		return List.of(
				new Estudiante("a1", "ap1", "ea1", 12, 18),
				new Estudiante("a2", "ap2", "ea2", 6, 15),
				new Estudiante("a3", "ap3", "ea3", 9, 16),
				new Estudiante("a4", "ap4", "ea4", 16, 20),
				new Estudiante("a5", "ap3", "ea5", 14, 22));
	}

	public Estudiante getDefault() {

		return new Estudiante("default", "ap1", "d1", 12, 18);
	}
}
