package programasSegundoA;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
       DecimalFormat formateador=new DecimalFormat("###,###.##");
		double pd1=0,pd2=0,pd3=0,total=0;
		

        System.out.println("Ingrese valor de producto 1:");
        pd1=leer.nextDouble();
		System.out.println("Ingrese valor de producto 2:");
		 pd2=leer.nextDouble();
		System.out.println("Ingrese valor de producto 3:");
		 pd3=leer.nextDouble();
		 
		 total=pd1+pd2+pd3;
		 
		 if (total>=1500){
			 total=total*1.11;
			 
		 }
		 else {
			 total=total*1.10;
		 }
		  System.out.println("El total seria: $" + formateador.format(total));
		 
	}

}
