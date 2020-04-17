package com.br.AppEsporteUIAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.AppEsporteUIAPI.model.Bodyboard;
import com.br.AppEsporteUIAPI.service.BodyboardService;

@Controller
public class BodyboardController {

	@Autowired BodyboardService serviceBodyboard;
	
	@RequestMapping(value = "/produtos/bodyboard/lista", method = RequestMethod.GET)
	public String showBodyboard(Model model) {

		model.addAttribute("bodyboards", serviceBodyboard.obterLista());

		return "/produtos/bodyboard/lista";
	}

	@RequestMapping(value = "/produtos/bodyboard/cadastro", method = RequestMethod.GET)
	public String cadastroBodyboard(Model model) {

		return "/produtos/bodyboard/cadastro";
	}

	@RequestMapping(value = "/produtos/bodyboard/cadastro", method = RequestMethod.POST)
	public String cadastroBodyboard(Model model, Bodyboard bodyboard) {

		serviceBodyboard.incluir(bodyboard);

		return showBodyboard(model);
	}

	@RequestMapping(value = "/produtos/bodyboard/excluir/{id}", method = RequestMethod.GET)
	public String excluirBodyboard(Model model, @PathVariable Integer id) {

		serviceBodyboard.excluir(id);

		return this.showBodyboard(model);
	}
}
