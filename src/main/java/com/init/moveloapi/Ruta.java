package com.init.moveloapi;

import java.util.ArrayList;

public class Ruta implements Componente{

	private int id;
	private float kmrecorrido;
	public ArrayList<PuntoGeografico> puntos;
	
	
	public Ruta() {
		this.id = 0;
		this.kmrecorrido = 0;
		this.puntos = new ArrayList<PuntoGeografico>();
	}
	
	public Ruta(int id, float kmrecorrido) {
		super();
		this.id = id;
		this.kmrecorrido = kmrecorrido;
		this.puntos = new ArrayList<PuntoGeografico>();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getKmrecorrido() {
		return kmrecorrido;
	}

	public void setKmrecorrido(float kmrecorrido) {
		this.kmrecorrido = kmrecorrido;
	}
	
	

	@Override
	public String toString() {
		return "Ruta [id=" + id + ", kmrecorrido=" + kmrecorrido + "]";
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
}
