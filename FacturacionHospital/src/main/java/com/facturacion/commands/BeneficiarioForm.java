package com.facturacion.commands;

import java.util.Date;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.facturacion.model.Carnet;
import com.facturacion.model.Parentesco;
import com.facturacion.model.Sexo;
import com.facturacion.model.TipoBeneficiario;
import com.facturacion.model.TipoDocumento;

public class BeneficiarioForm {

	private Long id;

	@NotEmpty
	private String documento;

	
	private TipoDocumento tipoDocumento;

	@NotEmpty
	private String nombre;

	@NotEmpty
	private String apellido;


	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechaNac;

	private TipoBeneficiario tipo;

	private Parentesco parentesco;

	private Sexo sexo;
	
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

	@Override
	public String toString() {
		return "BeneficiarioForm [id=" + id + ", documento=" + documento + ", tipoDocumento=" + tipoDocumento
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", tipo=" + tipo
				+ ", parentesco=" + parentesco + ", sexo=" + sexo + "]";
	}

	public Carnet getCarnet() {
		return carnet;
	}

	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}
	
	
}
