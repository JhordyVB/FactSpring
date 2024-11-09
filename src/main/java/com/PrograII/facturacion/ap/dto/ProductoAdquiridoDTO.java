package com.PrograII.facturacion.ap.dto;

import java.math.BigDecimal;




public class ProductoAdquiridoDTO {
    private String nombre;      // Nombre del producto
    private BigDecimal precio;  // Precio del producto
    private Integer cantidad;   // Cantidad adquirida (opcional)
    
    
    
	public ProductoAdquiridoDTO(String nombre, BigDecimal precio, Integer cantidad) {
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	
	public ProductoAdquiridoDTO() {
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
    
    
}

