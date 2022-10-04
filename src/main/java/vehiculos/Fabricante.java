package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int contador;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante MayFab = fabricantes.get(0);
	        for(Fabricante i : fabricantes){
	            if(i.contador > MayFab.contador){
	                MayFab = i;
	            }
	        }
		return MayFab;
	}

	public static ArrayList<Fabricante> getFrabricantes() {
		return fabricantes;
	}

	public static void setFrabricantes(ArrayList<Fabricante> frabricantes) {
		Fabricante.fabricantes = frabricantes;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
