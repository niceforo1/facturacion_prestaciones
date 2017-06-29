package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Hospital {
	
	@Id
	@GeneratedValue
	@Column(name = "hosp_id")
	private Long id;
	
	@Column(name = "hosp_cod_hpgd")
	private String codHpgd;

}
