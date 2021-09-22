package ar.edu.unlp.info.oo1.ejercicio6_red_de_alumbrado;

import java.util.ArrayList;

public class Farola {
	private ArrayList<Farola> neighbors;
	private boolean estado;
	/*
	 * true = on
	 * false = of
	 */
	
	public Farola () {
		estado = false;
		neighbors = new ArrayList<Farola>();
	}
	
	public boolean isOn() {
		return estado;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public ArrayList<Farola> getNeighbors() {
		return neighbors;
	}
	
	public void pairWithNeighbor(Farola farola) {
		this.getNeighbors().add(farola);
		farola.addFarola(this);
	}
	
	public void turnOn() {
		this.setEstado(true);
		for (Farola unaFarola : this.getNeighbors()) {
			if (!unaFarola.isOn())
				unaFarola.turnOn();
		}
	}
	
	public void turnOff() {
		this.setEstado(false);
		for (Farola unaFarola : this.getNeighbors()) {
			if (unaFarola.isOn())
				unaFarola.turnOff();
		}
	}
	
	public void addFarola(Farola farola) {
		this.getNeighbors().add(farola);
	}
}
