package com.facturacion.converters;

import org.springframework.stereotype.Component;

import com.facturacion.commands.BeneficiarioForm;
import com.facturacion.model.Beneficiario;

@Component("convertBeneficiario")
public class ConvertBeneficiario {

	public Beneficiario convertBeneficiarioFormToBeneficiario(BeneficiarioForm beneficiarioForm){
		Beneficiario beneficiario = new Beneficiario();
		beneficiario.setApellido(beneficiarioForm.getApellido());
		beneficiario.setNombre(beneficiarioForm.getNombre());
		beneficiario.setDocumento(beneficiarioForm.getDocumento());
		beneficiario.setCarnet(beneficiarioForm.getCarnet());
		beneficiario.setFechaNac(beneficiarioForm.getFechaNac());
		beneficiario.setId(beneficiarioForm.getId());
		beneficiario.setParentesco(beneficiarioForm.getParentesco());
		beneficiario.setSexo(beneficiarioForm.getSexo());
		beneficiario.setTipo(beneficiarioForm.getTipo());
		beneficiario.setTipoDocumento(beneficiarioForm.getTipoDocumento());		
		return beneficiario;
	}
	
	public BeneficiarioForm convertBeneficiarioToBeneficiarioForm(Beneficiario beneficiario){
		BeneficiarioForm beneficiarioForm = new BeneficiarioForm();
		beneficiarioForm.setApellido(beneficiario.getApellido());
		beneficiarioForm.setNombre(beneficiario.getNombre());
		beneficiarioForm.setDocumento(beneficiario.getDocumento());
		beneficiarioForm.setCarnet(beneficiario.getCarnet());
		beneficiarioForm.setFechaNac(beneficiario.getFechaNac());
		beneficiarioForm.setId(beneficiario.getId());
		beneficiarioForm.setParentesco(beneficiario.getParentesco());
		beneficiarioForm.setSexo(beneficiario.getSexo());
		beneficiarioForm.setTipo(beneficiario.getTipo());
		beneficiarioForm.setTipoDocumento(beneficiario.getTipoDocumento());		
		return beneficiarioForm;
	}
}
