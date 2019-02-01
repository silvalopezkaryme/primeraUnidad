package programasSegundoA;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa un número:");
		num = leer.nextByte();
		
		if (num % 2 == 0)
		{
			System.out.print("Es un número par");
		}
		else {
			System.out.print("Es un número impar");
		}

	}

}
