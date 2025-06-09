package com.terciarioisc6030.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.terciarioisc6030.banco.entity.Cliente;
import com.terciarioisc6030.banco.entity.CuentaBancaria;

@Repository
public interface ICuentaBancariaRepository extends JpaRepository<CuentaBancaria, Long>{

	List<CuentaBancaria> findByunCliente(Cliente clienteEncontradoId);
	
}
