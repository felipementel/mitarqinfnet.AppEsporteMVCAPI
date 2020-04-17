package com.br.AppEsporteUIAPI.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.AppEsporteUIAPI.model.Bicicleta;
import com.br.AppEsporteUIAPI.model.Bodyboard;
import com.br.AppEsporteUIAPI.model.Cliente;
import com.br.AppEsporteUIAPI.model.ItemVenda;
import com.br.AppEsporteUIAPI.model.Skate;
import com.br.AppEsporteUIAPI.model.Venda;
import com.br.AppEsporteUIAPI.service.BicicletaService;
import com.br.AppEsporteUIAPI.service.BodyboardService;
import com.br.AppEsporteUIAPI.service.ClienteService;
import com.br.AppEsporteUIAPI.service.SkateService;
import com.br.AppEsporteUIAPI.service.VendaService;

@Controller
public class VendaController {

	@Autowired
	private ClienteService serviceCliente;

	@Autowired
	private VendaService serviceVenda;

	@Autowired
	private BicicletaService serviceBicicleta;

	@Autowired
	private SkateService serviceSkate;

	@Autowired
	private BodyboardService serviceBodyboard;

	@RequestMapping(value = "/venda/vender", method = RequestMethod.GET)
	public String showVenda(Model model) {

		model.addAttribute("clientes", serviceCliente.obterLista());
		model.addAttribute("bicicletas", serviceBicicleta.obterLista());
		model.addAttribute("skates", serviceSkate.obterLista());
		model.addAttribute("bodyboards", serviceBodyboard.obterLista());

		return "venda/vender";
	}

	@RequestMapping(value = "/venda/vender", method = RequestMethod.POST)
	public String showVenda(Model model, Venda venda) {

		Optional<Cliente> _cliente = serviceCliente.obterPorId(venda.getCliente().getId());

		venda.setDatavenda(new Date());
		venda.setNomeloja("Uruguaiana");
		venda.setCliente(_cliente.get());

		Optional<Bicicleta> _bicicleta = serviceBicicleta.obterPorId(1);
		Optional<Skate> _skate = serviceSkate.obterPorId(2);
		Optional<Bodyboard> _bodyboard = serviceBodyboard.obterPorId(3);

		ItemVenda _itemVendaSkate = new ItemVenda();
		_itemVendaSkate.setDescricao("Descricao do Item Venda do Skate");
		_itemVendaSkate.setProduto(_skate.get());

		ItemVenda _itemVendaBicicleta = new ItemVenda();
		_itemVendaBicicleta.setDescricao("Descricao do Item Venda do Bicicleta");
		_itemVendaBicicleta.setProduto(_bicicleta.get());

		ItemVenda _itemVendaBodyboard = new ItemVenda();
		_itemVendaBodyboard.setDescricao("Descricao do Item Venda do Bodyboard");
		_itemVendaBodyboard.setProduto(_bodyboard.get());

		List<ItemVenda> _itensVendidos = new ArrayList<ItemVenda>();
		_itensVendidos.add(_itemVendaSkate);
		_itensVendidos.add(_itemVendaBicicleta);
		_itensVendidos.add(_itemVendaBodyboard);

		venda.setItensvenda(_itensVendidos);

		serviceVenda.incluir(venda);

		return showVendaLista(model);
	}

	@RequestMapping(value = "/venda/lista", method = RequestMethod.GET)
	public String showVendaLista(Model model) {

		List<Venda> listaVenda = serviceVenda.obterLista();

		model.addAttribute("listavendas", listaVenda);

		return "venda/lista";
	}

	@RequestMapping(value = "/venda/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {

		serviceVenda.excluir(id);

		return this.showVendaLista(model);
	}
}
