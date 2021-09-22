package ar.edu.unlp.info.oo1.ejercicio7_lookup_empleados;

public class Gerente extends EmpleadoJerarquico{
	private String nombre;
	
	public Gerente(String nombre) {
		this.nombre = nombre;
	}
	
	public double aportes() {
		return this.montoBasico() * 0.05d;
	}
	
	public double montoBasico() {
		return 57000;
	}
	
	public static void main (String [] args) {
		Gerente alan = new Gerente("Alan Turing");
		double aportesDeAlan = alan.aportes();
		double sueldoBasicoDeAlan = alan.sueldoBasico();
		System.out.println(aportesDeAlan); //2850
		System.out.println(sueldoBasicoDeAlan); //67850
	}
}
/*
 * alan.aportres() --> aportes() : Gerente, montoBasico() : Gerente
 * alan.sueldoBasico() --> sueldoBasico() : EmpleadoJerarquico, 
 *   sueldoBasico() : Empleado, montoBasico() : Gerente, aportes() : Gerente
 *   montoBasico() : Gerente, bonoPorCategoria() : EmpleadoJerarquico
 */

