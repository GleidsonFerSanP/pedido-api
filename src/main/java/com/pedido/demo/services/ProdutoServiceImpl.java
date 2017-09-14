package com.pedido.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedido.demo.model.produto.Produto;
import com.pedido.demo.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;

	@Override
	public Produto save(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public void delete(Produto produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Produto> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
