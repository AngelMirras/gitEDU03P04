package practicas0;

public class Mascota {
	private int numPatas;
	private String nombre;
	private String voz;
	private double peso;
	
	public Mascota(int numPatas, String nombre, String voz, double peso) {
		this.setNumPatas(numPatas);
		this.setNombre(nombre);
		this.setVoz(voz);
		this.peso = peso;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getVoz() {
		return voz;
	}

	public void setVoz(String voz) {
		this.voz = voz;
	}

	public double getPeso() {
		return peso;
	}
	
	

}
