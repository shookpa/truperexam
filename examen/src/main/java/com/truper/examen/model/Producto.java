package com.truper.examen.model;

import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "producto_id",nullable =false)
	private long id;
//	@Column (name="order_id")
//	private long order_id;
	@Column(name = "codigo", nullable =false)
	private String codigo;
	@Column(name = "descripcion", nullable =false)
	private String descripcion;
	@Column(name = "precio", nullable =false)
	private BigDecimal precio;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FK_ORDEN", nullable = false, updatable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Orden orden;

	private long order_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(long order_id) {
		this.order_id = order_id;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(long id, String codigo, String descripcion, BigDecimal precio, Orden orden, long order_id) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.orden = orden;
		this.order_id = order_id;
	}

}
