package ar.edu.unlp.info.oo1.ej4_figuras;

public class Cuadrado implements Cuerpos2D{
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getArea() {
		return lado * lado;
	}
	
	public double getPerimetro() {
		return lado * 4;
	}
}
