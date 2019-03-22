package es.unileon.prg.date;
/**
 * Clase que representa una fecha
 * 
 * @author PRG
 * @version 1.0
 */

public class Date {                         
                                         
                                         //Declaración de las variables
  private int day;   //Valor del día
  private int month;  //Valor del mes
  private int year; //Valor del año


  /**
   *Constructor de la clase.Construye una fecha con el dia 1 del mes 1 del anio 2019
   *
  */
  public Date() {                
    this.day=1;
    this.month=1;
    this.year=2019;
  }
  /**
   *Constructor de la clase.Construye un objeto de tipo Date
   *@param day
   *      Valor del dia
   *@param month
   *      Valor del mes
   *@param year
   *      Valor de anio
   *
  */
  public Date(int day, int month, int year)throws DateException{
    this.year=year;   //año correcto
    if (month<1 || month>12) {         //excepción si el mes no es válido
        throw new DateException ("Mes " + month + " no valido, " + " Valores posibles entre 1 y 12");       
    } 
    else if(day>this.daysOfMonth(month)) {
        throw new DateException ("Día " + day + " no valido, " + " Introduzca otro día");
      }
    this.month=month;    
    this.day=day;
  }
   /////////////////////////////////////
  //Constructor para crear otra fecha//
 /////////////////////////////////////
  public Date(Date otraFecha) {
    this.day=otraFecha.getDay();
    this.month=otraFecha.getMonth();
    this.year=otraFecha.getYear();
  }
  public int getDay() {                //Retorna el día
  	return day;
  }
  public void setDay(int day) {        //Modifica el valor del día
    this.day=day;
  }                      
  public int getMonth() {	             //Retorna el mes
  	return month;
  }
  public void setMonth(int month) {    //Modifica el valor del mes
    this.month=month;
  }
  public int getYear() {	             //Retorna el año
  	return year;
  }
  public void setYear(int year) {      //Modifica el valor del año
    this.year=year;
  }
  public Date nextDay() {  //Constructor que interviene en los dias que faltan hasta final de mes
    Date nextDay=null;
    int day;
    int month;
    int year;
      day=this.day;
      month=this.month;
      year=this.year;
        day++;
          if(day>this.daysOfMonth(month)) {
            day=1;
            month++;
              if(month>12) {
                month=1;
                year++;
              }

          }
      try {
        nextDay=new Date(day, month, year);
      }
      finally {
        return nextDay;
      }
      

  }
  ///////////////////////////
  //Métodos de tipo isSame//
  /////////////////////////
  /**
  //Método isSameYear
  public boolean isSameYear(Date otro) {
    if(this.year==otro.getYear() ) {
      return true;
    }else {
      return false;
    }
  }
  //Método isSameMonth
  public boolean isSameMonth(Date otro) {
    if(this.month==otro.getMonth() ) {
      return true;
    }else {
      return false;
    }
  }
  //Método isSameDay
  public boolean isSameDay(Date otro) {
    if(this.day==otro.getDay() ) {
      return true;
    }else {
      return false;
    }
  }
  */
      
    //////////////////
   //Métodos isSame//
  //////////////////

  //Método para comprobar si dos días son iguales
  public boolean isSameDay(Date sameFecha) {
    String day1=String.valueOf(day);
    String day2=String.valueOf(sameFecha.getDay());
    return day1.equals(day2);
  }
  //Método para comprobar si dos mese son iguales
  public boolean isSameMonth(Date sameFecha) {
    String month1=String.valueOf(month);
    String month2=String.valueOf(sameFecha.getDay());
    return month1.equals(month2);
  } 
  //Método para comprobar si dos años son iguales
  public boolean isSameYear(Date sameFecha) {
    String year1=String.valueOf(year);
    String year2=String.valueOf(sameFecha.getDay());
    return year1.equals(year2);
  }
  //Método isSame 
  public boolean isSame(Date sameFecha) {
    return (this.isSameDay(sameFecha) && this.isSameMonth(sameFecha) && this.isSameYear(sameFecha));
  }
  
    ///////////////////////////////////
   ////Métodos realizados con switch//
  /////////////////////////////////// 

  //Método que retorna el nombre del mes
  public String getNameOfMonth() {
    String mes=null;    //Inicio el nombre del mes(String) como vacio asginando el valor null
    switch(this.month) {
      case 1:
        mes="Enero";
        break;
      case 2:
        mes="Febrero";
        break;
      case 3:
        mes="Marzo";
        break;
      case 4:
        mes="Abril";
        break;
      case 5:
        mes="Mayo";
        break;
      case 6:
        mes="Junio";
        break;
      case 7:
        mes="Julio";
        break;
      case 8:
        mes="Agosto";
        break;
      case 9:
        mes="Septiembre";
        break;
      case 10:
        mes="Octubre";
        break;
      case 11:
        mes="Noviembre";
        break;
      case 12:
        mes="Diciembre";
        break;
    }
    return mes;
  }
  
  public boolean isDayRight(int month) {   
    boolean right=false;
    switch(month) {        
      case 1:  //next
      case 3:  //next
      case 5:  //next
      case 7:  //next
      case 8:  //next
      case 10: //next       
      case 12:
        if(day>=1 && day<=31) {
          right=true;
        }
        break;
      case 2:
        if(day>=1 && day<=28) {
          right=true;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if(day>=1 && day<=30) {
          right=true;
        }
        break;
      default:
        right=false;
    }
    return right;
  }
  public int daysOfMonth(int month) {   //Dias que tienen cada uno de los meses
    int day=0;
    switch(month) {    		
    	case 1:  //next
    	case 3:  //next
      case 5:  //next
    	case 7:  //next
    	case 8:  //next
    	case 10: //next  			
    	case 12:
    		day=31;
        break;
      case 2:
        day=28;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        day=30;
        break;
      default:
        day=0;
    }
    return day;
  }
  public int daysOfMonth() {
    return this.daysOfMonth(this.month);
  }
  public String nameSeason() {
    String estacion=null;   //inicio el nombre de la estación con un valor vacio
      switch(this.month) {
        case 1: //next
        case 2: //next
            estacion="Invierno";
          break;
        case 3:
          if(this.day<=21) {
            estacion="Invierno";
          }
          else {
            estacion="Primavera";
          }
          break;
        case 4:
        case 5:
          estacion="Primavera";
          break;
        case 6:
          if(this.day<=21) {
              estacion="Primavera";
          }else {
            estacion="Verano";
          }
          break;
        case 7:
        case 8:
          estacion="Verano";
          break;
        case 9:
          if(this.day<=23) {
            estacion="Verano";
          }else {
            estacion="Otoño";
          }
          break;
          case 10:
          case 11:
            estacion="Otoño";
            break;
          case 12:
            if(this.day<=21) {
              estacion="Otoño";
            }else {
              estacion="Invierno";
            }
            break;
      }
      return estacion;
  }
    //////////////////////////////
   //Métodos realizados con for//
  ////////////////////////////// 

  //Método que retorna los meses que faltan hasta el final del año
  public String monthsLeft() {
    Date rest=new Date(this);
      StringBuffer monthsLeft= new StringBuffer();
            for(int i=this.month+1;i<=12;i++) {
            rest.setMonth(i);
            monthsLeft.append(rest.getNameOfMonth() + " ");
        }
        return monthsLeft.toString();
    }
  //Método que retorna los dias que faltan del mes
  public String daysLeft() {
    Date rest=nextDay();
    StringBuffer daysLeft=new StringBuffer();
      for(int i=rest.getDay();isDayRight(i);i++) {
        rest.setDay(i);
        daysLeft.append(rest.toString() + " "); 
      }
      return daysLeft.toString();
  }
  //Método que retorna los meses con los mismo días
  public String sameDays() {
    Date same= new Date(this);
    StringBuffer meses= new StringBuffer();

         for(int i=1;i<=12;i++) {
            same.setMonth(i);
                if(same.daysOfMonth()==this.daysOfMonth()) {
                   meses.append(same.getNameOfMonth()+ " ");
                }
          }
    return meses.toString();
  }
  //Método que cuenta desde el primer dia hasta el dia introducido
  public int getCountDays() {
    int counter;                  //Declaro el contador de días
    counter=0;                    // Lo inicializo en 0
    try {
      Date cont=new Date(1,1,this.year);  //Creo un contador auxiliar para inicar la suma en 1

        for(int i=1;i<this.month;i++) {
          counter+=cont.daysOfMonth(i); //A mi variable counter le asigno el valor de los dias del mes de i asignadolo a la auxilar cont
          cont.setMonth(i+1);  //Incremento en 1 el mes
        } 
    }
    finally {
      return (counter + this.day-1);  //Retorna el contador hasta un día antes
    }
    
  }
   ////////////////////////////////////////
  //Métodos realizados con while~Dowhile//
 ////////////////////////////////////////

  //Nombre de los días de la semana
  private String nameDaysOfWeek(int day) {
    String nombre= " ";
    switch(day) {
      case 1:
      nombre="Lunes";
      break;
      case 2:
      nombre="Martes";
      break;
      case 3:
      nombre="Miercoles";
      break;
      case 4:
      nombre="Jueves";
      break;
      case 5:
      nombre="Viernes";
      break;
      case 6:
      nombre="Sábado";
      break;
      case 7:
      nombre="Domingo";
      break;
    }
    return nombre;
  }

  //Método que cuenta el número de intentos ~DoWhile~

  public int attempsCounterDate1() {
    int intentos, day,month,year;
    intentos=0;
      try {
        do {
          month=(int)(Math.random()*12)+1;
          day=(int)(Math.random()*this.daysOfMonth(month))+1;
          year=this.year;
            intentos++;
        }
        while(!this.isSame(new Date(day,month,year)));
      }
      finally {
         return intentos;
      }
  }

  //Mismo método que el de arriba para obtener la otra fecha realizado con while

  public int attempsCounterDate2() {
    int intentos, day,month,year;
    intentos=0;
    Date date2=null;
       try {
         month=(int)(Math.random()*12)+1;
          day=(int)(Math.random()*this.daysOfMonth(month))+1;
          year=this.year;
          date2=new Date(day,month,year);
          intentos++;
          while(!this.isSame(date2)) {
                month=(int)(Math.random()*12)+1;
                day=(int)(Math.random()*this.daysOfMonth(month))+1;
                year=this.year;
                date2=new Date(day,month,year);
                intentos++;
          }
        }
        finally {
          return intentos;
        }
  }
  /**
   * Método que identifica el dia de la semana de la fecha introducida
   *
   *@param day1
   *           objeto de tipo int
   *
   *@return 
   *        Devuelve el nombre del dia de la semana
   *
   */

  public String guessName(int day1) {
    int numeroDia;
    numeroDia=(getCountDays() %7 + day1)%7;
      return nameDaysOfWeek(numeroDia);
  }
  /**Método para imprimir la fecha
   *@Override
   *
  */
  public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
  }
}


  
           
