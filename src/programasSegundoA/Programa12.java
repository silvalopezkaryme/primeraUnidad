package  programasSegundoA;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int nc;
		double calif,prom,acumulador=0;
		System.out.println("Ingerese calificaciones a registrar:");
		nc=leer.nextInt();
		for (int i =0; i !=nc; i++) {
			System.out.println("Ingerese la calificación:");
			calif=leer.nextDouble();
			acumulador+=calif;
		
			
		}
          prom=acumulador/nc;
          if (prom>=0 & prom <=49){
        	  System.out.println("Suspenso, su promedio es de:" + prom);
        	  
          }
          else{
        	  if (prom>=50 & prom<=69) {
        		  System.out.println("Aprobado, su promedio es de:" + prom);  
        		  
        	  }
        	  
        	  
        	  else{
            	  if (prom>=70 & prom<=89) {
            		  System.out.println("Notable, su promedio es de:" + prom);  
            		  
            	  }
            	  else{
                	  if (prom>=90 & prom<=99) {
                		  System.out.println("Sobresaliente, su promedio es de:" + prom);  
                		  
                	  }
                	  else{
                    	  if (prom==100) {
                    		  System.out.println("Matricula de Honor, su promedio es de:" + prom);  
                    		  
                    	  }
                	  }
            	  }
            	  
            	  }
        	  }
          }
	}
            	  
        	  
	

        	  
