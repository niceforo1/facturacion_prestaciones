package com.facturacion.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.facturacion.commands.BeneficiarioForm;
import com.facturacion.converters.ConvertBeneficiario;
import com.facturacion.model.Beneficiario;
import com.facturacion.repositories.BeneficiarioRepository;
import com.facturacion.serveces.BeneficiarioService;

@Service("beneficiarioServiceImpl")
public class BeneficiarioServiceImpl implements BeneficiarioService {

	@Autowired
	@Qualifier("beneficiarioRepository")
	private BeneficiarioRepository beneficiarioRepository;

	@Autowired
	@Qualifier("convertBeneficiario")
	private ConvertBeneficiario convertBeneficiario;

	@Override
	public BeneficiarioForm getBeneficiario(String documento) {
		return convertBeneficiario
				.convertBeneficiarioToBeneficiarioForm(beneficiarioRepository.findByDocumento(documento));
	}

	@Override
	public boolean saveBeneficiario(BeneficiarioForm beneficiarioForm) {
		try {
			beneficiarioRepository.save(convertBeneficiario.convertBeneficiarioFormToBeneficiario(beneficiarioForm));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteBeneficiario(String documento) {
		try {
			beneficiarioRepository.delete(beneficiarioRepository.findByDocumento(documento));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
