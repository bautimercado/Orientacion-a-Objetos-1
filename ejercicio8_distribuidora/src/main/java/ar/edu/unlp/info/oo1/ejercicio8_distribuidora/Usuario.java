package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

public class Usuario {
	private String nombre;
	private String domicilio;
	
	private ArrayList<Factura> facturas;
	private ArrayList<Consumo> consumos;
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.facturas = new ArrayList<Factura>();
		this.consumos = new ArrayList<Consumo>();
	}
	
	public void agregarMedicion(Consumo medicion) {
		this.consumos.add(medicion);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDomicilio() {
		return this.domicilio;
	}
	
	public void agregarFactura(Factura factura) {
		this.facturas.add(factura);
	}
	
	
	public double ultimoConsumoActiva() {
		double aux = this.ultimoConsumoOptional()
				.map((Consumo consumo) -> consumo.getConsumoEnergiaActiva())
				.orElse(0d);
		System.out.println(aux);
		return aux;
	}
	
	
	public Consumo ultimoConsumo() {
		return this.ultimoConsumoOptional().orElse(null);
	}
	
	private Optional<Consumo> ultimoConsumoOptional() {
		return this.consumos
				.stream()
			    .max((Consumo consumo1, Consumo consumo2) -> consumo1.getFecha().compareTo(consumo2.getFecha()));
		
	}
	
	public List<Factura> getFacturas(){
		return new ArrayList<Factura>(this.facturas);
	}
	
	
	public Factura facturarEnBaseA(double precioKWh) {
		Consumo ultimo = this.ultimoConsumo();
		if (ultimo.equals(null))
			return new Factura(0, 0, this);
		
		double descuento = ((ultimo.factorDePotencia() > 0.8d) ? 10d : 0d);
		return new Factura(ultimo.costoEnBaseA(precioKWh), descuento, this);   //precioKWh es recibido por @param
	}
	
	public List<Consumo> getConsumos(){
		return new ArrayList<Consumo>(this.consumos);
	}
}
