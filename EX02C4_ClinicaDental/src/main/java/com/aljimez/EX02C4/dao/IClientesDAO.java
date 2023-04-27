package com.aljimez.EX02C4.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.EX02C4.dto.Clientes;

public interface IClientesDAO extends JpaRepository<Clientes, Integer>{



}
