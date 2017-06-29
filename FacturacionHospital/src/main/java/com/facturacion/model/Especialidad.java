package com.facturacion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Especialidad {

	@Id
	@GeneratedValue
	@Column(name = "esp_id")
	private Long id;
	
	@Column(name = "esp_codigo")
	private Long codigo;
}
