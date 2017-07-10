package com.facturacion.serveces;

import com.facturacion.commands.BeneficiarioForm;

public interface BeneficiarioService {
	
	public abstract BeneficiarioForm getBeneficiario(String documento);
	public abstract boolean saveBeneficiario(BeneficiarioForm beneficiarioForm);
	public abstract boolean deleteBeneficiario(String documento);
}
