package Arreglos;

public class ArreglosEj {

	public static void main(String[] args) {
		int intArray[];
		int [] intArray2;
		
		short shortArray[];//declaracion de arrary
		
		String array[];// declaracion de arrary
		
		array = new String[6];//Asignando memoria para 5 arreglos
		
		array[0] = "cero";
		array[1] = "uno";
		array[2] = "dos";
		array[3] = "tres";
		array[4] = "cuatro";
		array[4] = "cinco";
		
	//	System.out.println("Elemento en la posicion 1:" +array[1]);
	//System.out.println("Elemento en la posicion 3:" +array[3]);
		
		for(int i = 0; i < array.length;i++){
			System.out.println("El elemento dice" + i +":" + array[i]);
			
		}
		int[] intArrayDinamico = new int[] {10,2,5,4,3,4,12}; //Arreglo dinamico, no especificamos memoria
	}			
}


