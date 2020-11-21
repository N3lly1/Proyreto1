package Arreglos;

public class ArregloMultiEje {

	private static String[][] arr;
	private static int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{2,7,9}, {2,6,1}, {5,3}};
		
		System.out.println("Arreglo multi posicion 2,1: "+ arr[2][1]);
		System.out.println("Arreglo multi posicion 0,0: "+ arr[0][0]);
		System.out.println("Arreglo multi posicion 1,2: "+ arr[1][2]);
		
		
		for(int i= 0; i < arr.length; i++) {
			for (int j =0; j < arr[i].length; j++) {
			System.out.println("Arreglo multi posicio. "+i+ ", "+ j +": "+ arr[i][j]);
		}
		System.out.println();
		
			
			
		}
	}}
		
		
	


