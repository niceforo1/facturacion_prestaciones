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
@Table
public class Beneficiario {

	@Id
	@GeneratedValue
	@Column(name = "ben_id")
	private Long id;
	
	@Column(name = "ben_documento")
	private String documento;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tipo_doc_id")
	private TipoDocumento tipoDocumento;
	
	@Column(name = "ben_nombre")
	private String nombre;
	
	@Column(name = "ben_apellido")
	private String apellido;
	
	@Column(name = "ben_fecha_nac")
	private Date fechaNac;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tpo_ben_id")
	private TipoBeneficiario tipo;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "par_id")
	private Parentesco parentesco;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "sex_id")
	private Sexo sexo;
	
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "car_id")
	private Carnet carnet;
	
	
	//Orden de consulta <>
	
	
	
	//
	
	
}
