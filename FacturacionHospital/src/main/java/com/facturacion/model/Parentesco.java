package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Parentesco {

	@Id
	@GeneratedValue
	@Column(name = "par_id")
	private Long id;
	
	@Column(name = "par_desc")
	private String descripcion;
}
