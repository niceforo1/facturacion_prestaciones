package com.facturacion.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.facturacion.model.TipoDocumento;

@Repository
public interface TipoDocumentoRepository extends CrudRepository<TipoDocumento, Long> {
	
	public abstract TipoDocumento findById(Long id);
}
