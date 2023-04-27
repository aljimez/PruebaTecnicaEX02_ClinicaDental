package com.aljimez.EX02C4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.EX02C4.dto.Clientes;
import com.aljimez.EX02C4.dto.Visita;

public interface IVisitaDAO extends JpaRepository<Visita, Integer>{

//	List<Visita> listarVisitasXClientes(Clientes cliente);


	//List<Visita> findVisitsXOdontologoId(Long odontologistId);


	//List<Visita> listarVisitasXClientes(Clientes clientes);

	//List<Visita> listarVisitasXClientesId(int id);





}
