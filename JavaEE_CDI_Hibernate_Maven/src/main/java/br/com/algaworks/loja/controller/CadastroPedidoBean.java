package br.com.algaworks.loja.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.algaworks.loja.service.NegocioException;

@Named
@RequestScoped
public class CadastroPedidoBean {

	public void salvar() {
		throw new NegocioException("Pedido não pode ser salvo, pois ainda não foi implementado.");
	}

}
