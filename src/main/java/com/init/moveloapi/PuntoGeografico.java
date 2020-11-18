package com.init.moveloapi;

public class PuntoGeografico implements Componente{

	private float longitud;
	private float latitud;
	
	public PuntoGeografico() {
		this.longitud = 0;
		this.latitud = 0;
	}
	
	
	public PuntoGeografico(float latitud, float longitud) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
	}



	public float getLongitud() {
		return longitud;
	}




	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}




	public float getLatitud() {
		return latitud;
	}




	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}


	@Override
	public String toString() {
		return "PuntoGeografico [longitud=" + longitud + ", latitud=" + latitud + "]";
	}


	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}

}
