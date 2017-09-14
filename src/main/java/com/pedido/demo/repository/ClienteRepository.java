package com.pedido.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedido.demo.model.cliente.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
