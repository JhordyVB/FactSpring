package com.PrograII.facturacion.ap.dto;

import java.util.List;




public class FacturaRequest {

    private String clienteId;
    private List<String> productosId;
	public String getClienteId() {
		return clienteId;
			
		
	}
	public FacturaRequest(String clienteId, List<String> productosId) {
		this.clienteId = clienteId;
		this.productosId = productosId;
	}
	
	
	public FacturaRequest() {
	}
	
	public void setClienteId(String clienteId) {
		this.clienteId = clienteId;
	}
	public List<String> getProductosId() {
		return productosId;
	}
	public void setProductosId(List<String> productosId) {
		this.productosId = productosId;
	}
    
    
}