package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TipoPrestacion {

	@Id
	@GeneratedValue
	@Column(name = "tpo_prest_id")
	private Long id;

	@Column(name = "tpo_prest_desc")
	private String descripcion;
	

	//Tipos de prestacin Consulta, Práctica e Internación
	
}
