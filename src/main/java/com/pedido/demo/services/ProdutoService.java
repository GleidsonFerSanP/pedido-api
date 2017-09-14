package com.pedido.demo.services;

import java.util.List;

import com.pedido.demo.model.produto.Produto;

public interface ProdutoService {

	Produto save(Produto produto);
	
	void delete(Produto produto);
	
	List<Produto> list();
}
