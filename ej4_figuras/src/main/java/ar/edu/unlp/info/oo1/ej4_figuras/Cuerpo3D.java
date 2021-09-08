package ar.edu.unlp.info.oo1.ej4_figuras;

public class Cuerpo3D {
	private Cuerpos2D caraBasal;
	private double altura;
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void setCaraBasal(Cuerpos2D caraBasal) {
		this.caraBasal = caraBasal;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public double getSuperficieExterior() {
		//2* área-cara-basal + perímetro-cara-basal * altura-del-cuerpo
		return 2 * caraBasal.getArea() + caraBasal.getPerimetro() * altura;
	}
	
	public double getVolumen() {
		//área-cara-basal * altura
		return caraBasal.getArea() * altura;
	}
	
}
