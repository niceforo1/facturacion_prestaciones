package com.facturacion.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class OrdenDeConsulta {

	
	@Id
	@GeneratedValue
	@Column(name = "ord_cons_id")
	private Long id;
	
	
	//private List<Prestacion> lstPrestaciones;
	
	
}
