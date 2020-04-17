package com.br.AppEsporteUIAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.AppEsporteUIAPI.model.ItemVenda;

@Service
public class ItemVendaService {

	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<ItemVenda> obterLista() {
		return (List<ItemVenda>) rest.getForObject("http://localhost:8181/api/itemVenda/", List.class);
	}

	public Optional<ItemVenda> obterPorId(Integer id) {
		return null;
	}

	public void incluir(ItemVenda itemVenda) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/itemVenda/", itemVenda, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/itemVenda/{id}", id);
	}
}
