package ar.edu.unlp.info.oo1.ejercicio2_balanza_electronica;
import java.time.LocalDate;
import java.util.ArrayList;

public class Ticket {
	private LocalDate fecha;
	//private int cantidadDeProductos;
	//private double pesoTotal, precioTotal;
	private ArrayList<Producto> productos;
	
	public Ticket(LocalDate fecha, ArrayList<Producto> productos) {
		this.fecha = fecha;
		this.productos = productos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}


	public double getPesoTotal() {
		//return pesoTotal;
		double pesoTotal = productos.stream()
				 .mapToDouble(producto -> producto.getPeso())
		  		 .sum();
		 return pesoTotal;
	}


	public double getPrecioTotal() {
		//return precioTotal;
		double precioTotal = productos.stream()
				 .mapToDouble(producto -> producto.getPrecio())
		 		 .sum();
		 return precioTotal;
	}

	
	public double impuesto() {
		return this.getPrecioTotal() * 0.21;
	}
	
	public ArrayList<Producto> getProductos() {
		return this.productos;
	}
	
}
