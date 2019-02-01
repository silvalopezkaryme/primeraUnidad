package  programasSegundoA;


import java.util.Scanner;

public class Programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		byte dia=0;
		
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Ingresa num. dia de semana:");
		dia=leer.nextByte();
		
		switch (dia) {
		 
		
		case 1: System.out.print ("Lunes");break;
		case 2: System.out.print("Martes");break;
		case 3: System.out.print("Miercoles");break;
		case 4: System.out.print("Jueves");break;
		case 5: System.out.print( "Viernes");break;
		case 6: System.out.print("Sabado");break;
		case 7: System.out.print("Domingo");break;
		
		
		default: System.out.print("Dia invalido"); 
		
		
		
		

	
		}}}

