package Herencia;

public class Triangulo extends DosDimenciones{
	String estilo;
	//public double altura;
	//double base;
	
	double area() {
		return base*altura/2;
		
			
		}
	void mostrarEstilo() {
		System.out.println("Triangulo es:" + estilo);
		
		
		
	
	}
	

}
