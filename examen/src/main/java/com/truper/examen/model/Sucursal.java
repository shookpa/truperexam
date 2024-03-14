package com.truper.examen.model;

import java.util.List;

import javax.persistence.*;
@Entity
@Table (name="sucursal")
public class Sucursal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name="sucursal_id", nullable =false)    
	private long id;
	@Column (name="nombre", nullable =false)                               
	private String nombre;
	
	@OneToMany(mappedBy ="sucursal", cascade = CascadeType.ALL)
	private List<Orden> ordenes;	
	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sucursal(long id, String nombre, List<Orden> ordenes) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ordenes = ordenes;
	}
	
}
