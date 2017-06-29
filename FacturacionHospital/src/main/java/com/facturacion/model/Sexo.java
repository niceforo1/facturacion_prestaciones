package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Sexo {
	
	@Id
	@GeneratedValue
	@Column(name = "sex_id")
	private Long id;

	@Column(name = "sex_desc")
	private String descripcion;
}
