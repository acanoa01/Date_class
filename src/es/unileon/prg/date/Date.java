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


  //Constructor 
  public Date() {                //Construye una fecha con los valores de las variables
    this.day=1;
    this.month=1;
    this.year=2018;
  }
  //Constructor de la clase. Crea una fecha con los valores recibidos 
  public Date(int day, int month, int year)throws DateException{
    
    this.year=year;   //año correcto
    if (month<1 || month>12) {         //excepción si el mes no es válido
        throw new DateException ("Mes " + month + " no valido" + " Valores posibles entre 1 y 12");       
    } else {
        this.month=month;    //El mes introducido si es válido
    }
    if(day<1 || day>31) {    //si el día no es correcto arroja una excepción
        throw new DateException ("Día " + day + " no válido " + "valores posibles entre 1 y 31");
    } else {
        this.day=day;   //el día si es correcto
      }
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
  
  ///////////////////////////
  //Métodos de tipo isSame//
  /////////////////////////
  
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
   /////////////////
  //Método isSame//
 /////////////////

//Método para comprobar si dos días son iguales
    
  //////////////////////////////////
  //Métodos realizados con switch//
  ////////////////////////////////  


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

  //método para comprobar si el día es correcto
  public boolean isDayRight(int day) {  
  boolean right=true;
    switch(this.day) {
    		
    	case 1:  //next
    	case 3:  //next
      case 5:  //next
    	case 7:  //next
    	case 8:  //next
    	case 10: //next  			
    	case 12:
    		if(day<1 || day>31)
    			right=false;
        break;
    	case 2:
    		if(day<1 || day>28)
    			right=false;	
        break;   			
    	case 4:	//next
    	case 6:	//next
    	case 9:	//next
    	case 11:
    		if(day<1 || day>30)
    			 right=false;
        break;
    }
    return right;
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
  /** 
	 *  Método que imprime los meses que tienen los mismos días
	 *  que el mes de la fecha introducida
	 
	public int daysOfMonth() {
		}  
	*/
    
  //Método para imprimir el nombre del mes
  @Override
  public String toString() {
    return this.day + "/" + this.month + "/" + this.year;
  }
}


  
           
