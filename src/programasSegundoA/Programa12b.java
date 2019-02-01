package programasSegundoA;

import java.util.Scanner;

public class Programa12b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer= new Scanner(System.in);
		int nc,m,i=0,c1=0,mas100=0,menos100=0;
		double cm,acum=0,prome;
		System.out.println("Ingrese numero de clientes:");
		nc=leer.nextInt();
		while (i!=nc){
			m=1;
			c1++;
			
			do{
			System.out.println("Ingrese consumo de minutos mensual:" );	
			cm=leer.nextDouble();
			acum+=cm;
			if (cm>100) {
				mas100++;
			
			}else {
				if(cm<=100) {
					menos100++;
				}
			}
			m++;
			}while (m!=13);
			i++;
			
			prome=acum/nc;
			System.out.println("El total de minutos es de:" + acum);
			System.out.println("El premedio de minutos anual es:" + prome);
			System.out.println("Meses que se consumio mas de 100 minutos:" + mas100);
			System.out.println("Meses que se consumio menos de 100 minutos" + menos100);
		}
	}

}
