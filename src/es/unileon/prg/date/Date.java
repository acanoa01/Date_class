package es.unileon.prg.date;
/**
 * Clase que representa una fecha
 * 
 * @author PRG
 * @version 1.0
 */

public class Date {                         
/**
 * 
 * Valor del dia
 *
 * Valor del mes
 *
 * Valor de año
 *
 */                                       
  private int day;   
  private int month;  
  private int year; 
  /**
   * Constructor de la clase.Construye una fecha con el dia 1 del mes 1 del anio 2019
   *
   */
  public Date() {                
    this.day=1;
    this.month=1;
    this.year=2019;
  }
  /**
   *  Constructor de la clase.Construye un objeto de tipo Date
   *  @param day
   *      Valor del dia
   *  @param month
   *      Valor del mes
   *  @param year
   *      Valor de anio
   *
   */
  public Date(int day, int month, int year)throws DateException{
    if (month<1 || month>12) {         //excepción si el mes no es válido
        throw new DateException ("Mes " + month + " no valido, " + " Valores posibles entre 1 y 12");
    }       
    else if(day>this.daysOfMonth(month)) {
        throw new DateException ("Día " + day + " no valido, " + " Introduzca otro día");
      } 
      else {     
    this.day=day;
    this.month=month;
    this.year=year;
      }
  }
  /**
   * Constructor de la clase. Construye otra fecha con los valores recibidos
   * 
   * @param otrafecha
   *    objeto de tipo Date
   */       
  public Date(Date otraFecha) {
    this.day=otraFecha.getDay();
    this.month=otraFecha.getMonth();
    this.year=otraFecha.getYear();
  }
  /**
   * Método para obtener el dia 
   *
   * @return
   *    Devuelve el dia
   */    
  public int getDay() {               
  	return day;
  }
  /**
   * Método para establecer el dia 
   *
   * @param day
   *    variable de tipo int
   */    
  public void setDay(int day) {        
    this.day=day;
  }
  /**
   * Método para obtener el mes 
   *
   * @return
   *    Devuelve el mes
   */                          
  public int getMonth() {	             
  	return month;
  }
  /**
   * Método para establecer el mes 
   *
   * @param month
   *    variable de tipo int
   */    
  public void setMonth(int month) {    
    this.month=month;
  }
  /**
   * Método para obtener el año 
   *
   * @return
   *    Devuelve el año
   */    
  public int getYear() {	             
  	return year;
  }
  /**
   * Método para establecer el año 
   *
   * @param year
   *    variable de tipo int
   */    
  public void setYear(int year) {      
    this.year=year;
  }
  /**
   * Constructor de la clase.Crea una fecha con el dia siguiente
   *
   * @return
   *    Devuelve el dia siguiente.
   */    
  public Date nextDay() {  
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
   * Método que compara dos objetos de tipo Date y determina si tienen el mismo anio
   * 
   * @param otro
   *    Objeto de tipo Date
   *
   * @return
   *    Devuelve el valor booleano true si ambos anios coinciden
   *    Devuelve el valor booleano false si los anios son diferentes
   *
  public boolean isSameYear(Date otro) {
    if(this.year==otro.getYear() ) {
      return true;
    }else {
      return false;
    }
  }
   
   * Método que compara dos objetos de tipo Date y determina si tienen el mismo mes
   * 
   * @param otro
   *    Objeto de tipo Date
   *
   * @return
   *    Devuelve el valor booleano true si ambos meses coinciden
   *    Devuelve el valor booleano false si los meses son diferentes
   *
  public boolean isSameMonth(Date otro) {
    if(this.month==otro.getMonth() ) {
      return true;
    }else {
      return false;
    }
  }
  
   * Método que compara dos objetos de tipo Date y determina si tienen el mismo dia
   * 
   * @param otro
   *    Objeto de tipo Date
   *
   * @return
   *    Devuelve el valor booleano true si ambos dias coinciden
   *    Devuelve el valor booleano false si los dias son diferentes
   
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

  /**
   * Método que compara dos objetos de tipo Date y determina si tienen el mismo dia
   * 
   * @param sameFecha
   *    Objeto de tipo Date
   *
   * @return
   *    Devuelve el valor booleano true si ambos dias coinciden
   *    Devuelve el valor booleano false si los dias son diferentes
   */
  public boolean isSameDay(Date sameFecha) {
    String day1=String.valueOf(day);
    String day2=String.valueOf(sameFecha.getDay());
    return day1.equals(day2);
  }
  /**
   * Método que compara dos objetos de tipo Date y determina si tienen el mismo mes
   * 
   * @param sameFecha
   *    Objeto de tipo Date
   *
   * @return
   *    Devuelve el valor booleano true si ambos meses coinciden
   *    Devuelve el valor booleano false si los meses son diferentes
   */
  public boolean isSameMonth(Date sameFecha) {
    String month1=String.valueOf(month);
    String month2=String.valueOf(sameFecha.getDay());
    return month1.equals(month2);
  } 
  /**
   * Método para comparar dos objetos de tipo Date y determinar si el anio es igual
   *
   * @param sameFecha
   *    Objeto de tipo Date
   *
   * @return
   *     Devuelve el valor booleano true si las fechas coinciden  false 
   *     en caso contrario
   */
  public boolean isSameYear(Date sameFecha) {
    String year1=String.valueOf(year);
    String year2=String.valueOf(sameFecha.getDay());
    return year1.equals(year2);
  }
  /**
   * Método para comparar dos objetivos de tipo Date y comprobar si son iguales
   * 
   * @param sameFecha
   *    objeto de tipo Date
   *
   * @return
   *    Devuelve la comparacion entre las fechas
   */
  public boolean isSame(Date sameFecha) {
    return (this.isSameDay(sameFecha) && this.isSameMonth(sameFecha) && this.isSameYear(sameFecha));
  }
  
    ///////////////////////////////////
   ////Métodos realizados con switch//
  /////////////////////////////////// 

  /**
   * Método para obtener los meses del año
   *
   * @return
   *    Devuelve el nombre del mes correspondiente
   */  
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
  /**
   * Método que comprueba si el día introducido es correcto
   *
   * @param month
   *    variable de tipo int
   * @return
   *    Devuelve el valor booleano true a excepcion de que el dia introducido
   *    no se corecto, en ese caso, se devolverá false
   */    
  private boolean isDayRight() {   
    boolean right=true;
    switch(month) {        
      case 1:  //next
      case 3:  //next
      case 5:  //next
      case 7:  //next
      case 8:  //next
      case 10: //next       
      case 12:
        if(day>0 && day<=31) {
          right=true;
        }
        break;
      case 2:
        if(day>0 && day<=28) {
          right=true;
        }
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        if(day>0 && day<=30) {
          right=true;
        }
        break;
      default:
        right=false;
    }
    return right;
  }
  /**
   * Método que comprueba si el día introducido es correcto
   *
   * @param day
   *    variable de tipo int
   * @return
   *    si el valor booleano es true
   *    devuelve los dias del mes 
   *    Adicion: Este método ha sido creado para obtener los dias restantes 
   *             en un mes desde el día introducido
   */    
  private boolean isDayRight(int day) {
    return (day>0 &&day<=this.daysOfMonth(month));
  }
  /**
   * Método para conocer los dias de los meses del año
   *
   * @param month
   *    variable de tipo int
   * @return
   *   Devuelve los dias del mes
   */    
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
  /**
   * Método que devuelve los días del mes introducido
   *
   * @return
   *    Devuelve los días del mes introducido
   */    
  public int daysOfMonth() {
    return this.daysOfMonth(this.month);
  }
  /**
   * Método para obtener la estación del mes
   *
   * @return
   *    Devuelve la estación del mes
   */    
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
  /**
   * Método para obtener los mese que faltan hasta fin de año
   *
   * @return
   *    Devuelve los meses restantes 
   */    
  public String monthsLeft() {
    Date rest=new Date(this);
      StringBuffer monthsLeft= new StringBuffer();
            for(int i=this.month+1;i<=12;i++) {
            rest.setMonth(i);
            monthsLeft.append(rest.getNameOfMonth() + " ");
        }
        return monthsLeft.toString();
    }
  /**
   * Método que retorna los dias que faltan del mes
   *
   * @return 
   *    Devuelve los dias que faltan para acabar el mes desde el día introducido
   *
   */
  public String daysLeft() {
    Date next=nextDay();
    StringBuffer daysLeft=new StringBuffer();
      for(int i=next.getDay();isDayRight(i);i++) {
        next.setDay(i);
        daysLeft.append(next.toString() + " "); 
      }
      return daysLeft.toString();
  }
  /**
   * Método que obtiene los meses que tienen los mismos días
   *
   * @return
   *    Devuelve todos los meses con la misma cantidad de días
   */    
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
  /**
   * Método que cuenta desde el primer dia hasta el dia introducido
   *
   * @return
   *    Devuelve el sumatorio de días hasta el dia previo introducido
   */    
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
  /**
   * Método para conocer los nombres de los días de la semana 
   *
   * @param day
   *    variable de tipo int
   *
   * @return
   *    Devuelve el el nombre del día de la semana
   */    
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
  /**
   * Método para obtener el número de intentos para generar dos fechas iguales (realizado con Dowhile)
   *
   * @return
   *    Devuelve el número de intentos
   */    
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
  /**
   * Método que cuenta el número de intentos para generar dos fechas iguales(realizado con while)
   *
   * @return
   *    Devuelve el número de intentos
   */    
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
   */
  public String guessName(int day1) {
    int numeroDia;
    numeroDia=(getCountDays() %7 + day1)%7;
      return nameDaysOfWeek(numeroDia);
  }
  /**Método para imprimir la fecha
   * @Override
   *
   * @return
   *    Devuelve la fecha en formato String
   */
  public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
  }
}