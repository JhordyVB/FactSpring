package com.PrograII.Producto_microservice.entity;

import com.sistema.ap.app.entity.Factura;
import com.sistema.ap.app.entity.FacturaProductoId;
import com.sistema.ap.app.entity.Producto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura_productos")
@IdClass(FacturaProductoId.class) 
public class FacturaProducto {
	@Id
    @Column(name = "factura_id") // Nombre de columna en la base de datos
    private Integer facturaId;

    @Id
    @Column(name = "producto_id") // Nombre de columna en la base de datos
    private Integer productoId;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "factura_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Factura factura;  // Relación con Factura

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Producto producto; // Relación con Producto

	public FacturaProducto(Integer facturaId, Integer productoId, Integer cantidad, Factura factura,
			Producto producto) {

		this.facturaId = facturaId;
		this.productoId = productoId;
		this.cantidad = cantidad;
		this.factura = factura;
		this.producto = producto;
		
		
	}
	public FacturaProducto () {
	    
	}
	public Integer getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Integer facturaId) {
		this.facturaId = facturaId;
	}

	public Integer getProductoId() {
		return productoId;
	}

	public void setProductoId(Integer productoId) {
		this.productoId = productoId;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
}
