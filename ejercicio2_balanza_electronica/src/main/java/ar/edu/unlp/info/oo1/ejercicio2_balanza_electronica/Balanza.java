package ar.edu.unlp.info.oo1.ejercicio2_balanza_electronica;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal, pesoTotal;
	
	public Balanza() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}


	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.pesoTotal = 0;
		this.precioTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.pesoTotal += producto.getPeso();
		this.precioTotal += producto.getPrecio();
	}
	
	public Ticket emitirTicket() {
		Ticket ticket = new Ticket(java.time.LocalDate.now(), this.cantidadDeProductos, 
				this.pesoTotal, this.precioTotal);
		this.ponerEnCero();
		return ticket;
	}
}
