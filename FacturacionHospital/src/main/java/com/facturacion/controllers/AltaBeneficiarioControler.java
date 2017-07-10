package com.facturacion.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.facturacion.commands.BeneficiarioForm;
import com.facturacion.serveces.TipoDocumentoService;


@Controller
//@RequestMapping("/altabeneficiario")
public class AltaBeneficiarioControler {

	@Autowired
	@Qualifier("tipoDocumentoServiceImple")
	private TipoDocumentoService tipoDocumentoService;
	
	BeneficiarioForm beneficiarioForm = new BeneficiarioForm();
	
	@GetMapping("/formbeneficiario")
	public String inicio(Model model) {
		model.addAttribute("lista", tipoDocumentoService.lstTipoDoc());
		model.addAttribute("beneficiarioForm", beneficiarioForm);
		return "/altaBeneficiario";
	}
	
	
	@PostMapping("/cargarbeneficiario")
	public ModelAndView cargarBeneficiario(@ModelAttribute("beneficiarioForm") BeneficiarioForm beneficiarioForm){
		ModelAndView mav = new ModelAndView("altaBeneficiario");
		mav.addObject(beneficiarioForm);
		System.out.println(beneficiarioForm);
		
		return mav;
	}
	
	

	

}