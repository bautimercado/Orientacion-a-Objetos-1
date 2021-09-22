package ar.edu.unlp.info.oo1.ejercicio9_cuenta_con_ganchos;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {
		super();
	}
	
	protected boolean puedeExtraer(double monto) {
		return (((this.getSaldo() - monto) < 0) ? false : true);
	}
	
	public boolean extraer(double monto) {
		return super.extraer(monto + (monto*0.02));
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuenta) {
		if (this.puedeExtraer(monto + (monto*0.02))) {
			this.extraerSinControlar(monto + (monto*0.02));
			cuenta.depositar(monto);
			return true;
		}
		else
			return false;
	}
	
	
	public void depositar(double monto) {
		super.depositar(monto - (monto*0.02));
	}
}
