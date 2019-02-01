package  programasSegundoA;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte opc;
		
		Scanner leer = new Scanner(System.in);
		float p,ps;
		double op;
		
		
		System.out.println("Eliga alguna opcion:");
		
		

		System.out.println("1.-Pulgadas a centimetros");
		
		System.out.println("2.-Pies a centimetros");
		
		System.out.println("3.-Pies a pulgadas");
		opc=leer.nextByte();
		
switch (opc) {
		 
		
		case 1:System.out.println("¿Cuantas pulgadas necesita convertir a cm?");
		p=leer.nextFloat();
		op= p*2.54;
		System.out.println("centimetros:" + op);
		break;
		
		case 2: System.out.println("¿Cuantos pies necesita convertir a cm?") ;
		ps=leer.nextFloat();
		op=ps*30.48;
		System.out.println("centimetros:" + op);
		break;
		
		case 3: System.out.println("¿Cuantos pies necesita convertir a pulgadas?");
		ps=leer.nextFloat();
		op=ps*12;
		System.out.println("pulgadas:" + op);
		break;
		
		
		
		
		default: System.out.print("Opción invalido"); 
		

	}}}

