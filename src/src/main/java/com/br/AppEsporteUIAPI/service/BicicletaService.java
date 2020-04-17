package com.br.AppEsporteUIAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.AppEsporteUIAPI.model.Bicicleta;

@Service
public class BicicletaService {

	@Autowired
	private RestTemplate rest;

	public RestTemplate getRest() {
		return rest;
	}

	public void setRest(RestTemplate rest) {
		this.rest = rest;
	}

	@SuppressWarnings("unchecked")
	public List<Bicicleta> obterLista() {
		return (List<Bicicleta>) rest.getForObject("http://localhost:8181/api/bicicleta/", List.class);
	}

	public Optional<Bicicleta> obterPorId(Integer id) {
		/*
		 * ResponseEntity<Bicicleta> valor =
		 * rest.getForEntity("http://localhost:8181/api/bicicleta/" + id,
		 * Bicicleta.class);
		 */
		return null;
	}

	public void incluir(Bicicleta bicicleta) {
		// ResponseEntity<String> valor =
		rest.postForEntity("http://localhost:8181/api/bicicleta/", bicicleta, String.class);
	}

	public void excluir(Integer id) {
		rest.delete("http://localhost:8181/api/cicicleta/{id}", id);
	}
}