package ar.edu.unlp.info.oo1.ej4_figuras;

public class Circulo implements Cuerpos2D{
	private double radio;
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return radio * 2;
	}
	
	public double getRadio() {
		return radio;
	}
	
	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}
	
	public double getArea() {
		return Math.PI * (radio * radio); 
	}
}
