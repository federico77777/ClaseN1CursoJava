package clase3java;

import java.util.Arrays;

public class Clase3Java {

    public static void main(String[] args) {
        // Punto a: Contar la cantidad de veces que aparece una letra en una palabra
        String palabra = "Aprendiendo Java!";
        char letra = 'a';
        int num = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                num++;
            }
        }
        System.out.println("Punto a). La letra " + letra + " aparece " + num + " veces en la palabra.");

        // Punto b: Ordenar 3 números y retornarlos en un vector de 3
        int num1 = 7;
        int num2 = 2;
        int num3 = 4;
        boolean ordenAscendente = true;

        int[] numeros = new int[3];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;

        if (ordenAscendente) {
            Arrays.sort(numeros);
        } else {
            Arrays.sort(numeros);
            int temp = numeros[0];
            numeros[0] = numeros[2];
            numeros[2] = temp;
        }

        System.out.println("Punto b). Los números ordenados son: " + Arrays.toString(numeros));
        
        //Punto 1.c 
        
        int[] numeros2 = {5, 12, 7, 10, 3};
        int x = 6;
        int suma = 0;

        // Suma los números mayores que X
        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] > x) {
                suma += numeros2[i];
            }
        }

        // Imprime el resultado de la suma
        System.out.println("Punto c). La suma de los números mayores que " + x + " es: " + suma);
        
                       
        String mensajeCodificado = codificar("Hola Mundo!", 3);
        System.out.println("Mensaje codificado: " + mensajeCodificado);
        String mensajedeCodificado = decodificar(codificar("Hola Mundo!", 3), 3);
        System.out.println("Mensaje codificado: " + mensajedeCodificado);
        
        
    }
    //Punto 2 .
    private final static String abecedario = "abcdefghijklmnñopqrstuvwxyz";
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


