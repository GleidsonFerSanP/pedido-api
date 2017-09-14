package com.pedido.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pedido.demo.model.cliente.Cliente;
import com.pedido.demo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public Cliente save(Cliente cliente) {
		return repository.save(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
