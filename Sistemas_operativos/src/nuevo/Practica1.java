package nuevo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import javax.swing.JFileChooser;
import java.util.*;


public class Practica1 {

	public static void main(String[] args) {
		Archivos uno= new Archivos();	
		
		/*String ruta;
		Scanner entrada= new Scanner(System.in);
		
		
		
		System.out.println("escribe el nombre de el archivo sin extension");
		ruta=entrada.nextLine();*/
		
		String texto2=uno.leerArchivos();
		System.out.println(texto2);
		
	}
	
	
}