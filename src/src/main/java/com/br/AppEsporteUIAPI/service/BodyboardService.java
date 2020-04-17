package com.br.AppEsporteUIAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.AppEsporteUIAPI.model.Bodyboard;

@Service
public class BodyboardService {

	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Bodyboard> obterLista() {
		return (List<Bodyboard>) rest.getForObject("http://localhost:8181/api/bodyboard/", List.class);
	}

	public Optional<Bodyboard> obterPorId(Integer id) {
		return null;
	}

	public void incluir(Bodyboard bodyboard) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/bodyboard/", bodyboard, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/bodyboard/{id}", id);
	}
}