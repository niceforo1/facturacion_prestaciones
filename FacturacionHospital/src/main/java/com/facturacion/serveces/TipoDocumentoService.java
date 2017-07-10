package com.facturacion.serveces;

import java.util.List;

import com.facturacion.model.TipoDocumento;

public interface TipoDocumentoService {
	
	public abstract List<TipoDocumento> lstTipoDoc();
	public abstract TipoDocumento getTipoDocumento(Long id);
}
