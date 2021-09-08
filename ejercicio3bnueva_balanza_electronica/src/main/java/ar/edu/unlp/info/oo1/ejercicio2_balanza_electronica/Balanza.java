package ar.edu.unlp.info.oo1.ejercicio2_balanza_electronica;
import java.util.ArrayList;

public class Balanza {
	//private int cantidadDeProductos;
	//private double precioTotal, pesoTotal;
	private ArrayList<Producto> productos;
	//al tener una lista, se podrían obviar los totales
	
	public Balanza() {
		//this.cantidadDeProductos = 0;
		//this.precioTotal = 0;
		//this.pesoTotal = 0;
		this.productos = new ArrayList<Producto>();
	}
	
	
	public int getCantidadDeProductos() {
		//return cantidadDeProductos;
		return productos.size();
	}


	public double getPrecioTotal() {
		//return precioTotal;
		
		 double precioTotal = productos.stream()
				 .mapToDouble(producto -> producto.getPrecio())
		 		 .sum();
		 return precioTotal;
	}


	public double getPesoTotal() {
		//return pesoTotal;
		 double pesoTotal = productos.stream()
				 .mapToDouble(producto -> producto.getPeso())
		  		 .sum();
		 return pesoTotal;
	}


	public void ponerEnCero() {
		//this.cantidadDeProductos = 0;
		//this.pesoTotal = 0;
		//this.precioTotal = 0;
		this.getProductos().clear();
	}
	
	public void agregarProducto(Producto producto) {
		//this.cantidadDeProductos++;
		//this.pesoTotal += producto.getPeso();
		//this.precioTotal += producto.getPrecio();
		this.productos.add(producto);
	}
	
	public Ticket emitirTicket() {
		ArrayList<Producto> copia = new ArrayList<Producto>(productos);
		Ticket ticket = new Ticket(java.time.LocalDate.now(), copia);
		this.ponerEnCero();
		return ticket;
	}
	
	public ArrayList<Producto> getProductos() {
		return this.productos;
	}
	
	
	
}
