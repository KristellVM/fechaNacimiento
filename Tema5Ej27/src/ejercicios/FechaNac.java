package ejercicios;

import java.util.Scanner;

import util.Funciones;

public class FechaNac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("Selecciona la operaci�n:");
			System.out.println("1. Calcular edad en d�as");
			System.out.println("2. Calcular edad en meses");
			System.out.println("3. Mostrar edad completa (a�os, meses y d�as)");
			System.out.println("4. Calcula d�as al pr�ximo cumplea�os");
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
				System.out.println("Termin� la operaci�n");
			}
			
		}while(opcion!=0);

	}

}
