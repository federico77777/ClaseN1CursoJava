package clase1javaa;

public class Clase1Java {

    public static void main(String[] args) {
       
    	//Entradas punto 1
        int a = 2;
        int b = 14;
        boolean par = true;
        
        //Entradas punto 2
        float ingresos = 500000;
    	int cantidadVehiculos = 2;
    	int cantidadInmuebles = 2;
    	boolean tieneEmbarcacionAeronaveActivos = false;
        
    	
    	//Codigo Punto 1
        // Definir la variable "num" con el valor de "a"
        int num = a;
        
        // Imprimir los números entre "a" y "b"
        while(num <= b ) {
        	if (num % 2 == 0 && par ) {
            System.out.print(b-num + " "); // Imprimir el número actual
        	}
            else if (num % 2 != 0 && !par) {
            System.out.print(b-num + " "); // Imprimir el número actual
        	}
        	num++; // Incrementar la variable "num" en 1
            }
        
      //Codigo Punto 2
        
        //Compara los inmuebles/aeronves/ingresos , con los set.points con la sentencia if y devuelve el segmento
        if(tieneEmbarcacionAeronaveActivos || cantidadInmuebles >= 3 || cantidadVehiculos >= 3 || ingresos >= 489083) {
    	    System.out.println("La persona pertenece al segmento de ingresos altos.");
    	} 
    	else {
    	    System.out.println("La persona no pertenece al segmento de ingresos altos.");
    	}
        
        }
        
        
    }
