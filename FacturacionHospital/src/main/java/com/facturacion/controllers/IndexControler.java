package com.facturacion.controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.facturacion.commands.BeneficiarioForm;
import com.facturacion.model.TipoDocumento;
import com.facturacion.service.impl.BeneficiarioServiceImpl;


@Controller
//@RequestMapping("/index")
public class IndexControler {
	
	@Autowired
	@Qualifier("beneficiarioServiceImpl")
	BeneficiarioServiceImpl beneficiarioServiceImpl;
	
	@GetMapping("/consultadoc")
	public String mostrarConsulta(Model model)
	{
		BeneficiarioForm ben = new BeneficiarioForm();
		ben.setApellido("Carmona");
		ben.setNombre("Francisco");
		ben.setDocumento("34724646");
		try {
			ben.setFechaNac(new SimpleDateFormat("dd-MM-yyyy").parse("02-02-1990"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		beneficiarioServiceImpl.deleteBeneficiario("34724646");
		
		model.addAttribute("beneficiarioForm", new BeneficiarioForm());
		return "/index";
	}

	@PostMapping("/formbeneficiario")
	public ModelAndView cargarBeneficiario(@ModelAttribute("beneficiarioForm") BeneficiarioForm beneficiarioForm){
		ModelAndView mav = new ModelAndView("altaBeneficiario");
		List<TipoDocumento> listaDoc = new ArrayList<>();
		listaDoc.add(new TipoDocumento(1L, "PASAPORTE"));
		listaDoc.add(new TipoDocumento(2L, "PASAPORTE"));
		mav.addObject("lista", listaDoc);		
		mav.addObject("beneficiarioForm", beneficiarioForm);
		return mav;
	}
	
	
	
	
	
	


}