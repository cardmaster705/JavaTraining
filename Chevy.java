package carros;

public class Chevy extends Modelos{
	
	int capacidad;
	int a�o;
	
	public Chevy(Marcas nissan, String modelo, int asientos, double precio,int capacidad,int a�o) {
		super(nissan, modelo, asientos, precio);
		this.capacidad=capacidad;
		this.a�o=a�o;
	}
	
	
}
