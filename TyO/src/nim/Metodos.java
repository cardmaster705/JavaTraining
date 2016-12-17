package nim;
import java.util.Scanner;
public class Metodos {
	int n=3;
	int tam;
	String[]arreglo = new String[3];
	
	
	Scanner entrada= new Scanner(System.in);
	
	void ponerArreglo(){
		System.out.println("cuales son los valores a introducir:");
		arreglo[0]=entrada.nextLine();
		System.out.println("segunda cadena:");
		arreglo[1]=entrada.nextLine();
		System.out.println("ultima cadena :");
		arreglo[2]=entrada.nextLine();
		
	}
	void arregloEntrada(){
		for(int i=0;i<n;i++){
			arreglo[i]=entrada.nextLine();
		}
	}
	void lectura(){
		for(int i=0;i<n;i++){
			tam=arreglo[i].length();
			System.out.println("Cadena a verificar: "+arreglo[i]);
			for (int j = 0; j < tam ; j++ ){
				if(arreglo[i].charAt(j)>=48&&arreglo[i].charAt(j)<=57){
					System.out.println(arreglo[i].charAt(j)+": es un entero");
					
				} else{
					System.out.println("lalo y su amiga <3");
				}
				
			}
			System.out.println();
			
			
		}
		
	}
	
}

