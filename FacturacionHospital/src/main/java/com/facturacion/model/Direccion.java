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
@Table(name="direccion")
public class Direccion {
	
	@Id
	@GeneratedValue
	@Column(name = "dir_id")
	private Long id;

	@Column(name = "dir_calle")
	private String calle;
	
	@Column(name = "dir_numero")
	private Long numero;
	
	@Column(name = "dir_piso")
	private Long piso;
	
	@Column(name = "dir_dpto")
	private String dpto;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "prv_id")
	private Provincia provincia;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "loc_id")
	private Localidad localidad;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public Long getPiso() {
		return piso;
	}

	public void setPiso(Long piso) {
		this.piso = piso;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public Direccion(Long id, String calle, Long numero, Long piso, String dpto, Provincia provincia,
			Localidad localidad) {
		super();
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.dpto = dpto;
		this.provincia = provincia;
		this.localidad = localidad;
	}

	
	
	
}
