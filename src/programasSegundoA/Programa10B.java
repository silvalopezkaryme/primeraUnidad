package programasSegundoA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		DecimalFormat formateador= new DecimalFormat("###,###.##");
            byte s=0;
            double suma=0;
            int p=1;
            double t=0;
            System.out.println("Ingrese un numero del 0- 76(no mayor a 76 )");
            
            
            do{
            	System.out.println("Ingrese un numero :");	
            	s=leer.nextByte();
            	if (s>=0 && s<=76)
            			suma=suma+s;
            	p=p+1;
            }while (s<=76);
            
            t=suma/p;
            		System.out.println("El total de la suma es:" +formateador.format( suma));		
            System.out.println("El promedio es:" + t);	
            
	}

}


