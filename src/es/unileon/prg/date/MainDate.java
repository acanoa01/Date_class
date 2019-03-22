package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;

		try {
			today = new Date(1, 12, 2019);
			System.out.println(today.toString());

			System.out.println(today.getNameOfMonth());
			System.out.println("El mes introducido tiene: " +today.daysOfMonth()+ " dias");
			System.out.println(today.nameSeason());
			System.out.println("Faltan "+ today.monthsLeft());
			System.out.println("Faltan "+ today.daysLeft());
			System.out.println("Los meses con los mismos días son: " + today.sameDays());
			System.out.println("Días contados desde el 1 de Enero: " + today.getCountDays());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
