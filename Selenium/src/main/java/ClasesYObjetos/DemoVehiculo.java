package ClasesYObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo minivan = new Vehiculo();
		int rango;
		
		//asignar valores
		minivan.pasajeros = 9 ;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		 //calcular el rango
		rango= minivan.capacidad * minivan.kmh;
		
		System.out.println("la minivan puede llevar " + minivan.pasajeros +  " pasajeros con rango de "+ rango + "Kilometros");
		

	}

}
