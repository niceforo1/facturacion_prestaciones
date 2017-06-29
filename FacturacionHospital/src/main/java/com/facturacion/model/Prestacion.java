package com.facturacion.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Prestacion {

	@Id
	@GeneratedValue
	@Column(name = "prest_id")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tpo_prest_id")
	private TipoPrestacion tipo;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "esp_id")
	private Especialidad especialidad;
	
	@Column(name = "prest_codigo")
	private String codigo;
}
