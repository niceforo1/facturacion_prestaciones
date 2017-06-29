package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provincias")
public class Provincia {

	@Id
	@GeneratedValue
	@Column(name = "prv_id")
	private Long id;
	
	@Column(name = "prv_provincia")
	private String provincia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Provincia(Long id, String provincia) {
		super();
		this.id = id;
		this.provincia = provincia;
	}
	
	
	
}
