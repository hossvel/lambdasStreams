package optional;

import java.util.List;
import java.util.Optional;


public class ServiceEstudiante {

	public Optional<Estudiante> ObtenerporEmail(String email) {

		return ServiceEstudiante.getdata()
				.stream()
				.filter(x -> x.getEmail().equals(email)).findFirst();
	}

	private static List<Estudiante> getdata(){

		return List.of(
				new Estudiante("a1", "ap1", "e1", 12, 18),
				new Estudiante("a2", "ap2", "e2", 6, 15),
				new Estudiante("a3", "ap3", "e3", 9, 16),
				new Estudiante("a4", "ap4", "e4", 16, 20),
				new Estudiante("a5", "ap3", "e5", 14, 22));
	}

	public Estudiante getDefault() {

		return new Estudiante("default", "ap1", "d1", 12, 18);
	}
}
