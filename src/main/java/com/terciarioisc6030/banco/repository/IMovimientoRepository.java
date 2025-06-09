package com.terciarioisc6030.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.terciarioisc6030.banco.entity.Movimiento;

public interface IMovimientoRepository extends JpaRepository<Movimiento, Long>{

}
