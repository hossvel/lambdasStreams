package lambdasStreams;

public class LambdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GestionInterfaces gestionInterfaces = new GestionInterfaces();

		//sin parametros
		FunctionTest f1 = () -> System.out.println("Hola Mundo Lambda!!");

		gestionInterfaces.MiMetodo(f1);

		//con parametros entrada
		FunctionOperacion f2 = (a,b) -> System.out.println("Suma es: " + (a + b));
		gestionInterfaces.imprimeOperacion(f2, 5, 12);

		//usa retorno una lambda
		gestionInterfaces.imprimeOperacion(crear(), 45, 12);

		gestionInterfaces.imprimeOperacion((a,b) -> System.out.println("Multi es: " + (a * b)), 10, 12);

		//parametros entrada salida
		System.out.println(gestionInterfaces.operar((a,b) -> a+b, 150, 15));
		System.out.println(gestionInterfaces.operar((a,b) -> a-b, 150, 15));
		System.out.println(gestionInterfaces.operar((a,b) -> a*b, 150, 15));
		System.out.println(gestionInterfaces.operar((a,b) -> a%b, 150, 15));
	}

	private static FunctionOperacion crear() {
		return (a,b) -> System.out.println("Restarr es: " + (a - b));

	}



}
