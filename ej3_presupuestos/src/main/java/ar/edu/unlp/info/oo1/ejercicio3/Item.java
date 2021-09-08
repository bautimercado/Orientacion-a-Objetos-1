package ar.edu.unlp.info.oo1.ejercicio3;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public double costo() {
		return costoUnitario * cantidad;
	}
	
	public Item detalle(String detalle) {
		this.detalle = detalle;
		return this;
	}
	
	public Item costoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
		return this;
	}
	
	public Item cantidad(int cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
}
