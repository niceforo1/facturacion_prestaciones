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
@Table(name = "obra_social")
public class ObraSocial {
	
	@Id
	@GeneratedValue
	@Column(name = "os_id")
	private Long id;
	
	@Column(name = "os_razon_social")
	private String razonSocial;
	
	@Column(name = "os_codigo")
	private Long codigo;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "dir_id")
	private Direccion direccion;

}
