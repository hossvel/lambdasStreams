package lambdasStreams;

public class GestionInterfaces {

	public void MiMetodo(FunctionTest f1) {
		f1.saludar();
	}
	
	public void imprimeOperacion(FunctionOperacion f1,int a, int b) {
		f1.imprime(a, b);
	}

	public int operar(FunctionCalculadora f1,int a, int b) {
		return f1.calcular(a, b);
	}

}
