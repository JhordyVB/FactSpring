package com.PrograII.facturacion.ap.dto;

import java.util.List;

import com.sistema.facturacion.ap.dto.ProductoFacturaDTO;



public class FacturaDTO {
    private Integer clienteId;
    private List<ProductoFacturaDTO> productos;
    
    
    
	public FacturaDTO(Integer clienteId, List<ProductoFacturaDTO> productos) {
		super();
		this.clienteId = clienteId;
		this.productos = productos;
	}
	
	
	public FacturaDTO() {
	}


	public Integer getClienteId() {
		return clienteId;
	}
	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}
	public List<ProductoFacturaDTO> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoFacturaDTO> productos) {
		this.productos = productos;
	} 
    
    
}