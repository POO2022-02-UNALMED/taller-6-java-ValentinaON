package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
	private static ArrayList<Camioneta> vehiculo = new ArrayList<>();
	private boolean volco;
	public static int camionetas;
	
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		super(placa,puertas,velocidadMaxima,nombre,precio,peso,traccion,fabricante);
		this.volco = volco;
		Camioneta.vehiculo.add(this);
	}
	
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
		this.volco = volco;
		Camioneta.vehiculo.add(this);
	}
		
	public static int cantidadCamionetas() {
		if (Camioneta.vehiculo != null) {
			return Camioneta.vehiculo.size();
		}else { 
			return 0;
		}
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
