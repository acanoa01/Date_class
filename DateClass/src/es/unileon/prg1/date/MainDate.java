package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(20, 2, 2019);
			System.out.println(today.toString());

			System.out.println(today.getMonthName());
			System.out.println("El mes introducido tiene: " +today.daysOfMonth()+ " dias");
			System.out.println(today.getSeasonName());
			System.out.println("Faltan: "+ today.getMonthsLeft());
			System.out.println("Faltan: "+ today.getDaysLeftOfMonth());
			System.out.println("Los meses con los mismos días son: " + today.getMonthsSameDays());
			System.out.println("Días contados desde el 1 de Enero: " + today.daysPast());
			System.out.println("El día introducido es: " + today.dayOfWeek(7));
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
