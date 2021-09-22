package ar.edu.unlp.info.oo1.ejercicio8_distribuidora;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private Set<Usuario> usuarios;
	
	public Distribuidora(double precioKWh) {
		this.precioKWh = precioKWh;
		this.usuarios = new HashSet<Usuario>();
	}
	
	public double getPrecioKWh() {
		return this.precioKWh;
	}
	
	public void setPrecioKWh(double precioKWh) {
		this.precioKWh = precioKWh;
	}
	
	
	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public List<Usuario> getUsuarios(){
		return new ArrayList<Usuario>(this.usuarios);
	}
	
	public List<Factura> facturar(){
		return this.usuarios
				.stream()
				.map((Usuario usuario) -> usuario.facturarEnBaseA(getPrecioKWh()))
				.collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return this.usuarios
				.stream()
				.mapToDouble((Usuario usuario) -> usuario.ultimoConsumoActiva())
				.sum();
	}
	
	
	
}
