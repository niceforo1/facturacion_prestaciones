package com.facturacion.model;

import java.util.Date;

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
@Table(name="carnet")
public class Carnet {

	@Id
	@GeneratedValue
	@Column(name = "crn_id")
	private Long id;
	
	@Column(name = "crn_numero_carnet")
	private Long nroCarnet;
	
	@Column(name = "crn_emicion")
	private Date emicion;
	
	@Column(name = "crn_vencimiento")
	private Date vencimiento;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "os_id")
	private ObraSocial obraSocial;
}
