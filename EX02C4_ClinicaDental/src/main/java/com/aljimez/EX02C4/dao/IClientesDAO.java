package com.aljimez.EX02C4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.EX02C4.dto.Clientes;
import com.aljimez.EX02C4.dto.Visita;

public interface IClientesDAO extends JpaRepository<Clientes, Integer>{

	List<Visita> findByCliente(Clientes cliente);


}
