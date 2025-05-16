package Dominio;

public class Llantas {
	private long codigoBarra;
	private String Marca;
	private String medidad;
	private float precio;
	private int existencia;
	
	
	public Llantas(long codigoBarra, String marca, String medidad, float precio, int existencia) {
		this.codigoBarra = codigoBarra;
		Marca = marca;
		this.medidad = medidad;
		this.precio = precio;
		this.existencia = existencia;
	}


	@Override
	public String toString() {
		return "Llantas [codigoBarra=" + codigoBarra + ", Marca=" + Marca + ", medidad=" + medidad + ", precio="
				+ precio + ", existencia=" + existencia + "]\n";
		
		
	}


	public long getCodigoBarra() {
		return codigoBarra;
	}


	public void setCodigoBarra(long codigoBarra) {
		this.codigoBarra = codigoBarra;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}


	public String getMedidad() {
		return medidad;
	}


	public void setMedidad(String medidad) {
		this.medidad = medidad;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getExistencia() {
		return existencia;
	}


	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	

}
