package programasSegundoA;

import java.util.Scanner;

public class Programa5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float calif;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa tu calificación:");
		calif = leer.nextFloat();
		
		if (calif>=80)
		{
			System.out.print("Aprobado");
		}
		else {
			System.out.print("Reprobado");
		}


	}




	}


