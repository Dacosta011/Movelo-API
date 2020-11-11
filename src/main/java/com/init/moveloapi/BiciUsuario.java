package com.init.moveloapi;

public class BiciUsuario implements Componente{

	   private String nombre;
	    private String email;
	    private String rol;
	    private String id;

	    public BiciUsuario() {

	        this.email = "";
	        this.nombre = "";
	        this.rol = "";
	        this.id = "";
	    }

	    public BiciUsuario(String email, String nombre, String rol, String id) {

	        this.email = email;
	        this.nombre = nombre;
	        this.rol = rol;
	        this.id = id;
	    }

	    public String getNombre() {
	        return this.nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getEmail() {
	        return this.email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getRol() {
	        return this.rol;
	    }

	    public void setRol(String rol) {
	        this.rol = rol;
	    }

	    public String getId() {
	        return this.id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }


	    @Override
	    public String toString() {
	        return "{" + " nombre='" + getNombre() + "'" + ", email='" + getEmail() + "'" + ", rol='" + getRol() + "'"
	                + ", id='" + getId() + "'" + "}";
	    }
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		
	}
	
}
