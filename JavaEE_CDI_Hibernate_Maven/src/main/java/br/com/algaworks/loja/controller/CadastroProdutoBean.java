package br.com.algaworks.loja.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.algaworks.loja.model.Produto;
import br.com.algaworks.loja.service.NegocioException;

@Named
@RequestScoped
public class CadastroProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto;

	public Produto getProduto() {
		return produto;
	}

	public CadastroProdutoBean() {
		produto = new Produto();
	}

	public void salvar() {
		System.out.println("Salvar");
	}

}
