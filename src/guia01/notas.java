package guia01;

import java.util.Scanner;

public class notas {
	public static void main(String[]args) {
		int aprobados=0;
		int reprobados=0;
		float nota=0;
		int i=1;
		Scanner entrada=new Scanner(System.in);
		while(i<=10) {
			System.out.println("Ingrese la nota del alumno del 1 al 10: ");
			nota = entrada.nextFloat();
			if(nota>=7 && nota<=10) {
				aprobados ++;
			}else if(nota>=0 && nota<=6) {
				reprobados++;
			}
			i++;
		}
		 System.out.println("\nAlumnos reprobados: " + reprobados);
		 System.out.println("Alumnos aprobados: " + aprobados);
	}
}
