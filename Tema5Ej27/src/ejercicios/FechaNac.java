package ejercicios;

import java.util.Scanner;

import util.Funciones;

public class FechaNac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Selecciona la operación:");
			System.out.println("1. Calcular edad en días");
			System.out.println("2. Calcular edad en meses");
			System.out.println("3. Mostrar edad completa (años, meses y días)");
			System.out.println("4. Calcula días al próximo cumpleaños");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Selecciona una opcion", sc);
			
			switch(opcion) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 0:
				System.out.println("Terminó la operación");
			}
			
		}while(opcion!=0);

	}

}
