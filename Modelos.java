package carros;

public class Modelos {
	protected static Marcas marca;
	protected static String modelo;
	protected static int asientos;
	protected static double precio;
	
	public Modelos(Marcas nissan, String modelo, int asientos, double precio) {
		this.marca = nissan;
		this.modelo = modelo;
		this.asientos = asientos;
		this.precio = precio;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAsientos() {
		return asientos;
	}
	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void precioTotal(double descuento){
		System.out.println("El precio inicial es de: "+precio);
		System.out.println("El descuento es de :"+descuento);
		precio=precio-descuento;
		System.out.println("El precio final del auto es: "+precio);
	}
	public void datos(Marcas marca)
	{
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Asientos: "+asientos);
		System.out.println("Precio: "+precio);
		
	}
}
