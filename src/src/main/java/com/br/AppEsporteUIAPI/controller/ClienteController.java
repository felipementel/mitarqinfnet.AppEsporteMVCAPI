package com.br.AppEsporteUIAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.AppEsporteUIAPI.model.Cliente;
import com.br.AppEsporteUIAPI.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService service;

	public ClienteService getService() {
		return service;
	}

	public void setService(ClienteService service) {
		this.service = service;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showInit() {
		return this.showLogin();
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(Model model, @RequestParam String login, @RequestParam String senha) {

		if (!service.isValid(login, senha)) {
			model.addAttribute("msg", "Acesso inválido!!!");

			return "login";
		}

		model.addAttribute("user", login);

		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String showHome() {

		return "home";
	}

	@RequestMapping(value = "/cliente/cadastro", method = RequestMethod.GET)
	public String showDetalhe() {
		return "cliente/cadastro";
	}

	@RequestMapping(value = "/clientecadastro", method = RequestMethod.POST)
	public String incluir(Model model, Cliente cliente) {

		service.incluir(cliente);

		return this.obterLista(model);
	}

	@RequestMapping(value = "/clientelista", method = RequestMethod.GET)
	public String obterLista(Model model) {

		model.addAttribute("clientelista", service.obterLista());

		return "cliente/lista";
	}

	@RequestMapping(value = "/cliente/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {

		service.excluir(id);

		return this.obterLista(model);
	}

}