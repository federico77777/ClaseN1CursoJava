package clase4java;

import java.io.*;

public class Clase4JavaPunt2 {
	
	public static void main(String[] args) {
		
		FileReader archivo;
		BufferedReader lector; 
		int result = 0;
		int result1 = 1;
		String operacion = "*";
		
		try {
			archivo = new FileReader("C:\\Users\\fpriolo\\Desktop\\paraleer.txt\\");
			if (archivo.ready()) {
				lector = new BufferedReader (archivo);
				String cadena;
				while ((cadena = lector.readLine()) != null) {
		            if (operacion =="+") {
		            	result = result + Integer.parseInt(cadena);
		            }
		            if (operacion =="*") {
		            	result1 = result1 * Integer.parseInt(cadena);
		            }
				}
				
				if (operacion =="+") {
					System.out.println(result);
	            }
	            if (operacion =="*") {
	            	System.out.println(result1);
	            }
	            
			} else {
				System.out.println("El archivo no esta para leerse");
			}
					
		}catch (Exception e) {
			System.err.print("Error" + e.getMessage());
		}
	}
}
	
	
	