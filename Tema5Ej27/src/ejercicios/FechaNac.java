package ejercicios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import util.Funciones;

public class FechaNac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		LocalDate hoy = LocalDate.now();
		LocalDate fecha;
		fecha = Funciones.dimeFecha("Dime tu fecha de nacimiento", sc);

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
				System.out.println("Tu edad en días son: "+ChronoUnit.DAYS.between(fecha,hoy)+" días");
				break;
			case 2:
				System.out.println("Tu edad en meses son: "+ChronoUnit.MONTHS.between(fecha, hoy)+" meses");
				break;
			case 3:
				Period edad = Period.between(fecha, hoy);
				System.out.println("Tu edad completa es: "+edad.getYears()+" años, "+edad.getMonths()+" meses y "+edad.getDays()+" días");
				break;
			case 4:
				LocalDate fecha2 = LocalDate.of(hoy.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
				LocalDate futuro = LocalDate.of(hoy.getYear()+1, fecha.getMonth(), fecha.getDayOfMonth());
				LocalDate mismoAño = LocalDate.of(hoy.getYear(),fecha.getMonth(),fecha.getDayOfMonth());
				if(fecha2.isBefore(hoy)) {
					System.out.println("Los días que faltan para tu próximo cumpleaños son: "+ChronoUnit.DAYS.between(hoy, futuro));
				} else if(fecha2.isAfter(hoy)) {
					System.out.println("Los días que faltan para tu próximo cumpleaños son: "+ChronoUnit.DAYS.between(hoy, mismoAño));
				} else {
					System.out.println("Tu cumpleaños es hoy!");
				}
				break;
			case 0:
				System.out.println("Terminó la operación");
			}
			
		}while(opcion!=0);

	}

}
