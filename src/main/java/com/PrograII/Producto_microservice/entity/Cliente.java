package com.PrograII.Producto_microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Cliente {
	@jakarta.persistence.Entity
	@Table(name = "clientes")


	public class Cliente {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY) // Cambiado a IDENTITY para autoincremento
	    @Column(name = "id")
	    private Integer id; // Cambiado a Integer para autoincremento

	    @Column(nullable = false)
	    private String nombre;

	    @Column(name = "correo_electronico", length = 100, nullable = false, unique = true)
	    private String correo;

	    @Column(nullable = false)
	    private String telefono;
	    
	    public Cliente () {
	        
	    }
	    
	    

		public Cliente(Integer id, String nombre, String correo, String telefono) {
			this.id = id;
			this.nombre = nombre;
			this.correo = correo;
			this.telefono = telefono;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
}
