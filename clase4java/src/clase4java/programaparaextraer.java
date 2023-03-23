package clase4java;
import java.io.File;

public class programaparaextraer {
	public static void main(String[] args) {
		String ruta = "C:\\Users\\fpriolo\\Desktop\\FD\\Genneia\\subc\\cipsa\\1\\os\\001 a 0025\\";
		File carpeta = new File(ruta);
		File[] archivos = carpeta.listFiles();
		for (File archivo : archivos) {
			System.out.println(archivo.getName());
		}
	}
}
