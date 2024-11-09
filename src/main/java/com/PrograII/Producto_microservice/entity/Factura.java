package com.PrograII.Producto_microservice.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sistema.ap.app.entity.Cliente;
import com.sistema.ap.app.entity.FacturaProducto;

import jakarta.persistence.*;



@Entity
@Table(name = "facturas")
public class Factura {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Integer id; 

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<FacturaProducto> productos = new ArrayList<>(); // Inicializar la lista aquí

    @Column(nullable = false)
    private LocalDateTime fecha;

    @Column(nullable = false)
    private Double total;

    @Column(name = "direccion_empresa", nullable = false)
    private String direccionEmpresa;

    // Constructor vacío requerido por JPA
    public Factura() {
    }
    
   
    // Constructor con parámetros
    public Factura(Integer id, Cliente cliente, List<FacturaProducto> productos, LocalDateTime fecha, Double total, String direccionEmpresa) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.total = total;
        this.direccionEmpresa = direccionEmpresa;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<FacturaProducto> getProductos() {
        return productos;
    }

    public void setProductos(List<FacturaProducto> productos) {
        this.productos = productos;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }
}
