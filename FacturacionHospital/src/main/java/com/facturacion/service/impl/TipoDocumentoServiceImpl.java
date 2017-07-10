package com.facturacion.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.facturacion.model.TipoDocumento;
import com.facturacion.repositories.TipoDocumentoRepository;
import com.facturacion.serveces.TipoDocumentoService;

@Service("tipoDocumentoServiceImpl")
public class TipoDocumentoServiceImpl implements TipoDocumentoService{

	@Autowired
	@Qualifier("tipoDocumentoRepository")
	private TipoDocumentoRepository tipoDocumentoRepository;
	
	@Override
	public List<TipoDocumento> lstTipoDoc() {
		List<TipoDocumento> lstTipoDoc = new ArrayList<>();
		for(TipoDocumento doc : tipoDocumentoRepository.findAll()){
			lstTipoDoc.add(doc);
		}
		return lstTipoDoc;
	}

	@Override
	public TipoDocumento getTipoDocumento(Long id) {
		
		return tipoDocumentoRepository.findById(id);
	}

}
