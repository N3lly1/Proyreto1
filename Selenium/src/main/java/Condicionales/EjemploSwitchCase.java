package Condicionales;

public class EjemploSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i= 1;
		
		switch(i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		case 4:
			System.out.println("i es cuatro");	
			break;
			
			default:
				System.out.println("i es mayor que 2");	
				
		}
		
	}

}
