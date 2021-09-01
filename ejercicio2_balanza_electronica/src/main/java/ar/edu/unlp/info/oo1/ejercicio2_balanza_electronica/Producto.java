package ar.edu.unlp.info.oo1.ejercicio2_balanza_electronica;

public class Producto {
	private String descripcion;
	private double precioPorKilo, peso;
	
	public Producto() {
		this.descripcion = new String();
		this.precioPorKilo = 0;
		this.peso = 0;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioPorKilo() {
		return precioPorKilo;
	}

	public void setPrecioPorKilo(double precioPorKg) {
		this.precioPorKilo = precioPorKg;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecio() {
		return this.precioPorKilo * this.peso;
	}
}
