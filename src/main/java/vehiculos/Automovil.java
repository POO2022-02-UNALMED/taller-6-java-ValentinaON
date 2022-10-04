package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo{
	private static ArrayList<Automovil> vehiculo = new ArrayList<>();
	public static int automoviles;
	private int puestos;
	
	public Automovil() {
		Automovil.vehiculo.add(this);
	}
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa,puertas,velocidadMaxima,nombre,precio,peso,traccion,fabricante);
		this.puestos = puestos;
		Automovil.vehiculo.add(this);
	}
	
	public Automovil(String placa,String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		Automovil.vehiculo.add(this);
	}
	
	public static int cantidadAutomoviles() {
		if (Automovil.vehiculo != null) {
			return Automovil.vehiculo.size();
		}else { 
			return 0;
		}
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
}
