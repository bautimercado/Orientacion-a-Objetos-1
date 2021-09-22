package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;
import java.time.LocalDate;

public class Factura {
	private LocalDate fecha;
	private Usuario usuario;
	private double montoEnergiaActiva;
	private double descuento;
	
	public Factura(double montoEnergiaActiva, double descuento, Usuario usuario) {
		this.fecha = LocalDate.now();
		this.montoEnergiaActiva = montoEnergiaActiva;
		this.descuento = descuento;
		this.usuario = usuario;
	}
	
	public double getMontoEnergiaActiva() {
		return this.montoEnergiaActiva;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public double getDescuento() {
		return this.descuento;
	}
}
