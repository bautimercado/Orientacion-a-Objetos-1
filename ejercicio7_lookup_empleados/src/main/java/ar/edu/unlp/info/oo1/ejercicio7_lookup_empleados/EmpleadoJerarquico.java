package ar.edu.unlp.info.oo1.ejercicio7_lookup_empleados;

public class EmpleadoJerarquico extends Empleado{
	
	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	} 
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
}
