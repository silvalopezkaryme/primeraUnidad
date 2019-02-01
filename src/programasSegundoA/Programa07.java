package programasSegundoA;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f;
		double c;
	
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa temperatura F°:");
		f = leer.nextFloat();
		
		
	    c=(f-32)/1.8;
		
		
		
		System.out.println(f+ "F°");
		System.out.println(c+ "C°");

	}

}
