package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TipoBeneficiario {
	
	@Id
	@GeneratedValue
	@Column(name = "tpo_ben_id")
	private Long id;
	
	@Column(name = "tpo_ben_desc")
	private String descripcion;
	
}
