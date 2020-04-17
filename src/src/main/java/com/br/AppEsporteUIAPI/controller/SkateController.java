package com.br.AppEsporteUIAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.AppEsporteUIAPI.model.Skate;
import com.br.AppEsporteUIAPI.service.SkateService;

@Controller
public class SkateController {

	@Autowired
	SkateService serviceSkate;

	// Skate
	@RequestMapping(value = "/produtos/skate/lista", method = RequestMethod.GET)
	public String showSkate(Model model) {

		model.addAttribute("skates", serviceSkate.obterLista());

		return "produtos/skate/lista";
	}

	@RequestMapping(value = "/produtos/skate/cadastro", method = RequestMethod.GET)
	public String cadastroSkate(Model model) {

		return "produtos/skate/cadastro";
	}

	@RequestMapping(value = "/produtos/skate/cadastro", method = RequestMethod.POST)
	public String cadastroBodyboard(Model model, Skate skate) {

		serviceSkate.incluir(skate);

		return showSkate(model);
	}

	@RequestMapping(value = "/produtos/skate/excluir/{id}", method = RequestMethod.GET)
	public String excluirSkate(Model model, @PathVariable Integer id) {

		serviceSkate.excluir(id);

		return this.showSkate(model);
	}
}
