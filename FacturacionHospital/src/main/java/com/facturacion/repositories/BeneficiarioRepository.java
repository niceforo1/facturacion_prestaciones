package com.facturacion.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facturacion.model.Beneficiario;


@Repository
public interface BeneficiarioRepository extends  CrudRepository<Beneficiario, String>{
	
	public abstract Beneficiario findByDocumento(String documento);
}
