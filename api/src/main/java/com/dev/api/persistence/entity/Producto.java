package com.dev.api.persistence.entity;

import javax.persistence.*;

@Entity

@Table(name ="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_producto")
    private Integer idProducto;

    private  String nombre;

    @Column(name ="id_categoria")
    private Integer idCategoria;

    @Column(name ="codigo_barras")
    private String codigoBarras;

    @Column(name ="precio_venta" )
    private Double precioVenta;

    @Column(name ="cantidad_stok")
    private Integer cantidadStok;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStok() {
        return cantidadStok;
    }

    public void setCantidadStok(Integer cantidadStok) {
        this.cantidadStok = cantidadStok;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
