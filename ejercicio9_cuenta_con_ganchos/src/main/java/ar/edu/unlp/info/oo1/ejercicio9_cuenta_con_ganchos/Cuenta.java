package ar.edu.unlp.info.oo1.ejercicio9_cuenta_con_ganchos;

public abstract class Cuenta {
	private double saldo;
	
	public Cuenta() {
		this.saldo = 0;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		this.saldo += monto;
	}
	
	protected void extraerSinControlar(double monto) {
		this.saldo -= monto;
	}
	
	/*
	 * Las clases derivadas de Cuenta implementarán
	 * el método puedeExtraer(double monto) : boolean
	 */
	protected abstract boolean puedeExtraer(double monto);
	
	
	public boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) { // --> depende de la clase del objeto
			this.extraerSinControlar(monto);
			return true;
		}
		else
			return false;
	}
	
	public boolean transferirACuenta(double monto, Cuenta cuenta) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuenta.depositar(monto);
			return true;
		}
		else
			return false;
	}
}
