package com.br.AppEsporteUIAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.AppEsporteUIAPI.model.Bicicleta;
import com.br.AppEsporteUIAPI.service.BicicletaService;

@Controller
public class BicicletaController {
	@Autowired
	BicicletaService serviceBicicleta;

	@RequestMapping(value = "/produtos/bicicleta/lista", method = RequestMethod.GET)
	public String showBicicleta(Model model) {

		model.addAttribute("bicicletas", serviceBicicleta.obterLista());

		return "produtos/bicicleta/lista";
	}

	@RequestMapping(value = "/produtos/bicicleta/cadastro", method = RequestMethod.GET)
	public String cadastroBicicleta(Model model) {

		return "produtos/bicicleta/cadastro";
	}

	@RequestMapping(value = "/produtos/bicicleta/cadastro", method = RequestMethod.POST)
	public String cadastroBicicleta(Model model, Bicicleta bicicleta) {

		serviceBicicleta.incluir(bicicleta);

		return showBicicleta(model);
	}

	@RequestMapping(value = "/produtos/bicicleta/excluir/{id}", method = RequestMethod.GET)
	public String excluirBicicleta(Model model, @PathVariable Integer id) {

		serviceBicicleta.excluir(id);

		return this.showBicicleta(model);
	}
}
