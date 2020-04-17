package com.br.AppEsporteUIAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.AppEsporteUIAPI.model.Venda;

@Service
public class VendaService {

	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Venda> obterLista() {
		return (List<Venda>) rest.getForObject("http://localhost:8181/api/venda/", List.class);
	}

	public Optional<Venda> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Venda venda) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/venda/", venda, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/venda/{id}", id);
	}
}