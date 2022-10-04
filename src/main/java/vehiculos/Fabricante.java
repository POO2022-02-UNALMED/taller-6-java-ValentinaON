package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int contador;
	private static ArrayList<Fabricante> listado = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante MayFab = listado.get(0);
	        for(Fabricante i : listado){
	            if(i.contador > MayFab.contador){
	                MayFab = i;
	            }
	        }
		return MayFab;
	}

	public static ArrayList<Fabricante> getFrabricantes() {
		return listado;
	}

	public static void setFrabricantes(ArrayList<Fabricante> listado) {
		Fabricante.listado = listado;
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
