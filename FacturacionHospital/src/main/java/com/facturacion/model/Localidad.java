package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="localidades")
public class Localidad {
	
	@Id
	@GeneratedValue
	@Column(name = "loc_id")
	private Long id;
	
	@Column(name = "loc_localidad")
	private String localidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Localidad(Long id, String localidad) {
		super();
		this.id = id;
		this.localidad = localidad;
	}
	
	
}
