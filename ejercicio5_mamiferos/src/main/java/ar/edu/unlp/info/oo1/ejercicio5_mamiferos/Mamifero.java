package ar.edu.unlp.info.oo1.ejercicio5_mamiferos;

//import java.util.ArrayList;
import java.time.LocalDate;

public class Mamifero {
	private Mamifero padre;
	private Mamifero madre;
	
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	
	//private ArrayList hijos;
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	
	public Mamifero() {}

	public Mamifero getPadre() {
		return padre;
	}

	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}

	public Mamifero getMadre() {
		return madre;
	}

	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Mamifero getAbueloMaterno() {
		return ((this.getMadre() == null) ? null : this.getMadre().getPadre());
	}
	
	public Mamifero getAbuelaMaterna() {
		return ((this.getMadre() == null) ? null : this.getMadre().getMadre());
	}
	
	public Mamifero getAbueloPaterno() {
		return ((this.getPadre() == null) ? null : this.getPadre().getPadre());
	}
	
	public Mamifero getAbuelaPaterna() {
		return ((this.getPadre() == null) ? null : getPadre().getMadre());
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean encontre = false;
		if ((this.getPadre() == unMamifero) || (this.getMadre() == unMamifero))
			encontre = true;
		else {
			if (this.getPadre() != null)
				encontre = this.getPadre().tieneComoAncestroA(unMamifero);
			if ((!encontre) && (this.getMadre() != null))
				encontre = this.getMadre().tieneComoAncestroA(unMamifero);
		}
		return encontre;
	}
}
