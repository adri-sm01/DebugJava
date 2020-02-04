package depuracion;

import java.util.Scanner;

public class ClaseDepuracion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int numeroLeido;
		
		
		for(int i = 0; i < 5 ; i++) {
			
			System.out.println("Introduce Numero: ");
			numeroLeido = input.nextInt();
			
			if(esPar(numeroLeido)) {
				System.out.println("Numero leido es par");
			}else {
				System.out.println("es Impar");
			}
			System.out.println("El numero leido es: "+ numeroLeido);
			
			
		}
		
		System.out.println("Programa Terminado");
		
		
		input.close();
	}
	
	static boolean esPar(int numero){
		System.out.println("Voy a evaluar el numero");
		if(numero % 2 == 0) {
			return true;
		}
		
		return false;
	}
	

}
