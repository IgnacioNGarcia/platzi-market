package com.platzi.market.persistence.entity;

import jakarta.persistence.*;

@Entity //Le da a entender a java que la clase se va a comportar
// como una clase que mapea una tabla de una BBDD
@Table(name = "productos")
//Como el nombre de la clase es distinto al nombre de la clase copiamos el
// nombre de la tabla y lo ponemos acá
public class Producto {
    @Id //Se pone porque es la PK del registro
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Esto porque se genera automáticamente gracias a la secuencia.
    @Column(name = "id_producto")
    private Integer idProducto;
    //Siempre que una columna se llame distinto en la clase agregamos esa anotacion

    private String nombre;

    @Column(name="id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

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

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
