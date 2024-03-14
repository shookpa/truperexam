package com.truper.examen.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table (name="orden")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="orden_id", nullable =false)   
	private long id;
	@Column (name="id_sucursal", nullable =false)
	private long id_sucursal;
	@Column (name="fecha", nullable =false)
	private LocalDate fecha;
	@Column (name="total", nullable =false)
	private BigDecimal total;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "FK_SUCURSAL", nullable = false, updatable=false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Sucursal sucursal;
	private long sucursal_id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getId_sucursal() {
		return id_sucursal;
	}
	public void setId_sucursal(long id_sucursal) {
		this.id_sucursal = id_sucursal;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	@OneToMany(mappedBy ="orden", cascade = CascadeType.ALL)
	private List<Producto> productos;
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public long getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public Orden(long id, long id_sucursal, LocalDate fecha, BigDecimal total, Sucursal sucursal, long sucursal_id,
			List<Producto> productos) {
		super();
		this.id = id;
		this.id_sucursal = id_sucursal;
		this.fecha = fecha;
		this.total = total;
		this.sucursal = sucursal;
		this.sucursal_id = sucursal_id;
		this.productos = productos;
	}
	public Orden() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
