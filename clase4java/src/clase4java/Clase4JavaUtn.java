package clase4java;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Clase4JavaUtn {

	public static void main(String[] args) {
        
        // Punto 1.a y 1.b y 1.c 
        int num1 = 7;
        int num2 = 2;
        int num3 = 4;
        char asendente ='a';
        char desendente ='d';
        char letra = JOptionPane.showInputDialog("Ingrese asendente o desendente").charAt(0);

        int[] numeros = new int[3];
        numeros[0] = num1;
        numeros[1] = num2;
        numeros[2] = num3;
        
        if (letra == asendente || letra == desendente ) {

		        if (letra == asendente) {
		            Arrays.sort(numeros);
		            System.out.println("Punto 1.a y 1.b y 1.c). Los números ordenados son: " + Arrays.toString(numeros));
		        } else {		            
		        }
		        if (letra == desendente) {
		        	Arrays.sort(numeros);
		            int temp = numeros[0];
		            numeros[0] = numeros[2];
		            numeros[2] = temp;
		            System.out.println("Punto 1.a y 1.b y 1.c). Los números ordenados son: " + Arrays.toString(numeros));
		        } else {            
		        }
		         
        }

        
            
}
	}