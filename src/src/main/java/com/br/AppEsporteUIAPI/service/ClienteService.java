package com.br.AppEsporteUIAPI.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.AppEsporteUIAPI.model.Cliente;

@Service
public class ClienteService {

	@Autowired
	private RestTemplate rest;

	public boolean isValid(String login, String senha) {
		return "admin".equalsIgnoreCase(login) && "admin".equalsIgnoreCase(senha);
	}

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> obterLista() {

		return (List<Cliente>) rest.getForObject("http://localhost:8181/api/cliente/", List.class);
	}

	public Optional<Cliente> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Cliente cliente) {

		cliente.setDatacadastro(new Date());
		cliente.setIsativo(true);

		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/cliente/", cliente, String.class);
	}

	public void excluir(Integer id) {

		rest.delete("http://localhost:8181/api/cliente/{id}", id);
	}
}