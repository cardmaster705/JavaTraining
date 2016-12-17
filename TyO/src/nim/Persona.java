package nim;
import java.util.Scanner;
public class Persona {
	String nombre;
	int edad;
	String sexo;
	int opcion;
	int i;
	int aux;
	int[]arreglo={1,16,10,4,3,8};
	int n=arreglo.length;
	Scanner entrada=new Scanner(System.in);
	
	public Persona(){}
	
	void menu(){
		do{
			System.out.println("selecciona una de las siguientes opciones:");
			System.out.println("1.-capturar");
			System.out.println("2.-mostrar");
			System.out.println("3.-calculadora");
			System.out.println("4.-salir");
			System.out.println("que opcion deseas utilizar");
			opcion=entrada.nextInt();
			switch(opcion){
				case 1:
					capturar();
						break;
				case 2:
					mostrar();
						break;
				case 3:
					burbuja();
						break;
							}
		
			}while(opcion!=4 && opcion<5);
	}
	
	void mostrar(){
		System.out.println("tu nombre es: "+nombre);
		System.out.println("tu edad es: "+edad);
		System.out.println("tu sexo es: "+sexo);
		
		
	}
	
	void capturar(){
		System.out.println("cual es tu nombre:");
		nombre=entrada.nextLine();
		nombre=entrada.nextLine();
		System.out.println("cual es tu edad: ");
		edad=entrada.nextInt();
		System.out.println("cual es tu sexo: ");
		sexo=entrada.nextLine();
		sexo=entrada.nextLine();
	}
	
	void capturar(String nombre, int edad, String sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;		
	}
	
	void suma(){
		int a,b,c;
		System.out.println("cual es el primer numero:");
		a=entrada.nextInt();
		System.out.println("cual es eñ segunro numero:");
		b=entrada.nextInt();
		c=a+b;
		System.out.println("la suma total es: "+c);
		
	} 
	
	void imprimeB(){
		burbuja();
		
		for(int i=0;i<n;i++){
			System.out.println("imprime:"+arreglo[i]);
		}
	}
	
	void burbuja(){
		for(int j=0;j<n;j++){
		for(i=0;i<n-1-j;i++){
			if(arreglo[i]>arreglo[i+1]){
				aux=arreglo[i+1];
				arreglo[i+1]=arreglo[i];
				arreglo[i]=aux;
				
			}
		}
					
		
		}
		
		
	}
}
