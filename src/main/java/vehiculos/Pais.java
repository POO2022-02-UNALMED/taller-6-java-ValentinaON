package vehiculos;

public class Pais {
	private String nombre;
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
    public static Pais paisMasVendedor() {
        Fabricante MayFab = Fabricante.fabricaMayorVentas();
        return MayFab.getPais();
    }
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
