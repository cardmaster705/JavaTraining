package carros;

public class Fabrica {

	public static void main(String[] args) {
		
		Chevy c1= new Chevy(Marcas.nissan, "Chevy", 5, 240000, 240, 2017);
		
		c1.precioTotal(1000);
		c1.datos(Marcas.nissan);
	}

}
