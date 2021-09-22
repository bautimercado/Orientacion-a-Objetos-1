package ar.edu.unlp.info.oo1.ejercicio9_cuenta_con_ganchos;

public class CuentaCorriente extends Cuenta{
	private double limiteDeDescubierto;
	
	public CuentaCorriente() {
		super();
		this.limiteDeDescubierto = 0;
	}
	
	public void setLimiteDeDescubierto(double limiteDeDescubierto) {
		this.limiteDeDescubierto = limiteDeDescubierto;
	}
	
	public double getLimiteDeDescubierto() {
		return this.limiteDeDescubierto;
	}
	
	protected boolean puedeExtraer(double monto) {
		return (((this.getSaldo() - monto) < this.getLimiteDeDescubierto()) ? false : true);
	}
	
	
}
