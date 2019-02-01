package programasSegundoA;

import java.util.Scanner;

public class Programa12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int p,p200=0,p400=0;
		double precio,acumulador;
		System.out.println("Ingrese número de productos:");
		p=leer.nextInt();
		
		for(int i =1;i<=p; i++ ){
			System.out.println("El precio del producto es:");
			precio=leer.nextDouble();
			if(precio>0 && precio<=200){
				p200++;
			}
			if (precio>200 && precio<=400){
				p400++;
			}
			
	}
		
		System.out.println("El número de productos vendidos con precio de 200 o menor son :" + p200);
		System.out.println("El número de productos vendidos con precio entre 200 0 400 es:" + p400);
		
}
}
