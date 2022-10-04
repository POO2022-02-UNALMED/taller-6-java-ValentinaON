package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static int contador = 0;
	private static ArrayList<String> paises = new ArrayList<String>();
	private static ArrayList<Integer> paisesRep = new ArrayList<Integer>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public static int paisMasVendedor() {
		for(String i:paises) {
			for(String j:paises) {
				if(j==i) {
					paisesRep.add(contador++);
					
				}else{
					paisesRep.add(contador);
				}
			}	
		}
		int MF=paisesRep.get(0), Aparece=0;
	        for(int i=0;i<paisesRep.get(i);i++)
	        {
	            if(MF<paisesRep.get(i)){
	                MF=paisesRep.get(i);
	                Aparece = i;
	            }
	        }
		return Aparece;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
