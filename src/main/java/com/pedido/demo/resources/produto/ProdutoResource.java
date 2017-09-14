package com.pedido.demo.resources.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.demo.model.produto.Produto;
import com.pedido.demo.services.ProdutoService;

@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Produto produto){
		return ResponseEntity.ok(service.save(produto));
	}

}
