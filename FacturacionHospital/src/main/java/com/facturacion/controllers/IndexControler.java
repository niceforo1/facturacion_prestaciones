package com.facturacion.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.facturacion.commands.BeneficiarioForm;
import com.facturacion.model.TipoDocumento;


@Controller
//@RequestMapping("/index")
public class IndexControler {
	
	@GetMapping("/consultadoc")
	public String mostrarConsulta(Model model)
	{
		model.addAttribute("beneficiarioForm", new BeneficiarioForm());
		return "/index";
	}

	@PostMapping("/formbeneficiario")
	public ModelAndView cargarBeneficiario(@ModelAttribute("beneficiarioForm") BeneficiarioForm beneficiarioForm){
		ModelAndView mav = new ModelAndView("altaBeneficiario");
		List<TipoDocumento> listaDoc = new ArrayList<>();
		listaDoc.add(new TipoDocumento(1L, "DNI"));
		mav.addObject("lista", listaDoc);		
		mav.addObject("beneficiarioForm", beneficiarioForm);
		return mav;
	}
	
	
	
	
	
	


}