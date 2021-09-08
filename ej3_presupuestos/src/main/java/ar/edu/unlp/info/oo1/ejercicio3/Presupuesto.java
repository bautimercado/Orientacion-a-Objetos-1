package ar.edu.unlp.info.oo1.ejercicio3;

import java.util.ArrayList;
import java.time.LocalDate;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	public Presupuesto() {
		items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}

	public double calcularTotal() {
		double total = items.stream()
				.mapToDouble(item -> item.costo())
				.sum();
		return total;
		
	}
	
	public Presupuesto cliente(String cliente) {
		this.cliente = cliente;
		return this;
	}
}


