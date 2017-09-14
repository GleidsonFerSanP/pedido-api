package com.pedido.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedido.demo.model.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
