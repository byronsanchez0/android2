package guia01;

import java.util.Scanner;
	public class  numerosdivisibles {
		public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
		    System.out.println("App para mostrar dos numeros divisibles entre si \n");
		    System.out.println("Inserte un numero x: ");
		    int x = in.nextInt();
		    System.out.println("ingrese un numero y");
		    int y = in.nextInt();

		    if(x % y ==0){
		        System.out.println(x + "es divisible por " + y);
		    }else {
		        System.out.println(x + " no es divisible por " + y);
		    }
		}
	}
		
		
		 
	


