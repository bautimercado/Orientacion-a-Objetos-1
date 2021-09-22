package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;
import java.time.LocalDate;

public class Consumo {
	private double consumoEnergiaReactiva;
	private double consumoEnergiaActiva;
	private LocalDate fecha;
	
	public Consumo(LocalDate fecha, double consumoEnergiaActiva, double consumoEnergiaReactiva) {
		this.fecha = fecha;
		//this.fecha = LocalDate.now();
		this.consumoEnergiaActiva = consumoEnergiaActiva;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
	}
	
	
	public double getConsumoEnergiaActiva() {
		return this.consumoEnergiaActiva;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getConsumoEnergiaReactiva() {
		return this.consumoEnergiaReactiva;
	}
	
	public double costoEnBaseA(double precioKWh) {
		return this.getConsumoEnergiaActiva() * precioKWh;
	}
	
	public double factorDePotencia() {
		//double aux = Math.sqrt(Math.pow(this.getConsumoEnergiaActiva(), 2) + Math.pow(this.getConsumoEnergiaActiva(), 2));
		//return this.getConsumoEnergiaActiva() / aux;
		return Math.sqrt(Math.pow(this.getConsumoEnergiaActiva(), 2) + Math.pow(this.getConsumoEnergiaActiva(), 2));
	}
	
	
}
