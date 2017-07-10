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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}


	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Date getFechaNac() {
		return fechaNac;
	}


	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}


	public TipoBeneficiario getTipo() {
		return tipo;
	}


	public void setTipo(TipoBeneficiario tipo) {
		this.tipo = tipo;
	}


	public Parentesco getParentesco() {
		return parentesco;
	}


	public void setParentesco(Parentesco parentesco) {
		this.parentesco = parentesco;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	public Carnet getCarnet() {
		return carnet;
	}


	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}
	
	
	//Orden de consulta <>
	
	
	
	
	
	
}
