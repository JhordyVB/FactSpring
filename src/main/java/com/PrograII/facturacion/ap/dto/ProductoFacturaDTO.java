package com.PrograII.facturacion.ap.dto;


import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoFacturaDTO {
    private Integer productoId;   
    private String nombre;        
    private BigDecimal precio;   
    private Integer stock;        
    private Integer cantidad;
    
    
    
	public ProductoFacturaDTO(Integer productoId, String nombre, BigDecimal precio, Integer stock, Integer cantidad) {

		this.productoId = productoId;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.cantidad = cantidad;
	}
	
	
	public ProductoFacturaDTO() {
		super();
	}


	public Integer getProductoId() {
		return productoId;
	}
	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
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
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	} 
    
    

  
}
