package com.PrograII.facturacion.ap.dto;

import java.time.LocalDateTime;
import java.util.List;




public class FacturaResponseDTO {
    private Integer id;
    private String clienteNombre;
    private Double total;
    private LocalDateTime fecha;
    private List<ProductoAdquiridoDTO> productos; // Cambiar de ProductoFacturaDTO a ProductoAdquiridoDTO
    private String direccionEmpresa;
    
    
    
	public FacturaResponseDTO(Integer id, String clienteNombre, Double total, LocalDateTime fecha,
			List<ProductoAdquiridoDTO> productos, String direccionEmpresa) {
		this.id = id;
		this.clienteNombre = clienteNombre;
		this.total = total;
		this.fecha = fecha;
		this.productos = productos;
		this.direccionEmpresa = direccionEmpresa;
	}
	
	
	public FacturaResponseDTO() {
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClienteNombre() {
		return clienteNombre;
	}
	public void setClienteNombre(String clienteNombre) {
		this.clienteNombre = clienteNombre;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public List<ProductoAdquiridoDTO> getProductos() {
		return productos;
	}
	public void setProductos(List<ProductoAdquiridoDTO> productos) {
		this.productos = productos;
	}
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	} 
    
    
}
