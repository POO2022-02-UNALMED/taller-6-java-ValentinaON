package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo{
	private static ArrayList<Camion> vehiculo = new ArrayList<>();
	private int ejes;
	public static int camiones;
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes){
		super(placa,puertas,velocidadMaxima,nombre,precio,peso,traccion,fabricante);
		this.ejes = ejes;
		Camion.vehiculo.add(this);
	}
	
	public Camion(String placa,String nombre, int precio, int peso, Fabricante fabricante, int ejes){
		super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
		Camion.vehiculo.add(this);
	}
	
	public static int cantidadCamiones() {
		if (Camion.vehiculo != null) {
			return Camion.vehiculo.size();
		}else { 
			return 0;
		}
	}
	
	public int getEjes() {
		return ejes;
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
