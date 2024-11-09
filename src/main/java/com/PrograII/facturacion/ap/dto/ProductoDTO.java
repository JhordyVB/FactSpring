package com.PrograII.facturacion.ap.dto;

public class ProductoDTO {
    private Integer productos_id; // Cambiado a Integer
    private String nombre;
    private double precio;
    private int stock;
    
    
    
	public ProductoDTO(Integer productos_id, String nombre, double precio, int stock) {
		super();
		this.productos_id = productos_id;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	
	public ProductoDTO() {
	}


	public Integer getProductos_id() {
		return productos_id;
	}
	public void setProductos_id(Integer productos_id) {
		this.productos_id = productos_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
    
    
}
