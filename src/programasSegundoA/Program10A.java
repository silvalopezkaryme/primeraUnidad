package programasSegundoA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		 int c=1;
         double total=0.0,pd=0.0,totalp=0;
         String opc;
         byte i=0, numero=0;
         DecimalFormat formateador = new DecimalFormat("###,###.##");
         c=c+1;
          
       
         
         do{
       	  System.out.println("Ingrese valor de producto :");
       	pd=leer.nextDouble();
       	  total=pd;
       	  c=c+1;
       	  
       
       	 
         }
       	while (c<=3);	
         
	 if (total>=1500)
         total=total*1.11;
         else{
		totalp=total*1.10;
		System.out.println(total);
	}

}}
