package com.aljimez.EX02C4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.EX02C4.dto.Clientes;
import com.aljimez.EX02C4.dto.Visita;

//DAO Visitas funciones visitasXcliente 
public interface IVisitaDAO extends JpaRepository<Visita, Integer>{

//	List<Visita> listarVisitasXClientesId(int id);

	List<Visita> findByCliente(Clientes cliente);




	//List<Visita> findVisitsXOdontologoId(Long odontologistId);



	//List<Visita> listarVisitasXClientesId(int id);





}
