package clase4java;

public class Clase4JavaPunt3 {

		 public static void main(String[] args) {
		       
		                       
		        String mensajeCodificado = codificar("Hola Mundo!", 3);
		        System.out.println("Mensaje codificado: " + mensajeCodificado);
		        String mensajedeCodificado = decodificar(codificar("Hola Mundo!", 3), 3);
		        System.out.println("Mensaje codificado: " + mensajedeCodificado);
		        
		        
		    }
		    //Punto 2 .
		    public final static String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		    //cadena de caracteres que representa todas las letras del alfabeto.
		   

		    public static String codificar(String mensaje, int desplazamiento) {
		    	//Defino un método llamado "codificar" que acepta dos argumentos: 
		    	//un mensaje como una cadena de caracteres y un número entero que representa 
		    	//el desplazamiento para la codificación.
		        String mensajeCodificado = "";
		        for (int i = 0; i < mensaje.length(); i++) {
		            char letra = mensaje.charAt(i);
		            int indexLetra = abecedario.indexOf(letra);
		            if (indexLetra == -1) { // si no es una letra del abecedario, se agrega tal cual al mensaje codificado
		                mensajeCodificado += letra;
		            } else {
		                int indexLetraCodificada = (indexLetra + desplazamiento) % abecedario.length(); // se aplica la fórmula de codificación
		                char letraCodificada = abecedario.charAt(indexLetraCodificada);
		                mensajeCodificado += letraCodificada;
		            }
		        }
		        return mensajeCodificado;
		    }

		    public static String decodificar(String mensajeCodificado, int desplazamiento) {
		        String mensaje = "";
		        for (int i = 0; i < mensajeCodificado.length(); i++) {
		            char letraCodificada = mensajeCodificado.charAt(i);
		            int indexLetraCodificada = abecedario.indexOf(letraCodificada);
		            if (indexLetraCodificada == -1) { // si no es una letra del abecedario, se agrega tal cual al mensaje
		                mensaje += letraCodificada;
		            } else {
		                int indexLetra = (indexLetraCodificada - desplazamiento + abecedario.length()) % abecedario.length(); // se aplica la fórmula de decodificación
		                char letra = abecedario.charAt(indexLetra);
		                mensaje += letra;
		            }
		        }
		        return mensaje;
		    }
		



}
