package com.pedido.demo.services;

import java.util.List;

import com.pedido.demo.model.cliente.Cliente;

public interface ClienteService {
	
	Cliente save(Cliente cliente);
	
	void delete(Cliente cliente);
	
	List<Cliente> list();

}
