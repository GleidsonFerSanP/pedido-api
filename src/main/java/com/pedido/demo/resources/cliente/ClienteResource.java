package com.pedido.demo.resources.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pedido.demo.model.cliente.Cliente;
import com.pedido.demo.services.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Cliente cliente){
		return ResponseEntity.ok(service.save(cliente));
	}

}
