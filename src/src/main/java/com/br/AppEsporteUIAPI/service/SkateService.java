package com.br.AppEsporteUIAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.AppEsporteUIAPI.model.Skate;

@Service
public class SkateService {

	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Skate> obterLista() {
		return (List<Skate>) rest.getForObject("http://localhost:8181/api/skate/", List.class);
	}

	public Optional<Skate> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Skate skate) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/skate/", skate, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/skate/{id}", id);
	}
}