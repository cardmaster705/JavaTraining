package carros;

public class Chevy extends Modelos{
	
	int capacidad;
	int año;
	
	public Chevy(Marcas nissan, String modelo, int asientos, double precio,int capacidad,int año) {
		super(nissan, modelo, asientos, precio);
		this.capacidad=capacidad;
		this.año=año;
	}
	
	
}
