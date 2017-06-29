package com.facturacion.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.facturacion.commands.BeneficiarioForm;
import com.facturacion.model.TipoDocumento;

import javassist.expr.NewArray;

@Controller
//@RequestMapping("/altabeneficiario")
public class AltaBeneficiarioControler {

	BeneficiarioForm beneficiarioForm = new BeneficiarioForm();
	@GetMapping("/formbeneficiario")
	public String inicio(Model model) {
		List<TipoDocumento> listaDoc = new ArrayList<>();
		listaDoc.add(new TipoDocumento(1L, "DNI"));
		model.addAttribute("lista", listaDoc);
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