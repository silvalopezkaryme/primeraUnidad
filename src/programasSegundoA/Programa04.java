package programasSegundoA;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edad;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa tu edad:");
		edad=leer.nextByte();
		
		if (edad>=18)
		{
			System.out.print("Es mayor de edad");
		}
		else {
			System.out.print("Es menor de edad");
		}

	}

}
