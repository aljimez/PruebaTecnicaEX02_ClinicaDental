package com.aljimez.EX02C4.service;

import java.util.List;

import com.aljimez.EX02C4.dto.Clientes;
import com.aljimez.EX02C4.dto.Odontologo;
import com.aljimez.EX02C4.dto.Visita;

public interface IVisitaService {
//CRUD Visita
	Visita visitaXID(int id);

	List<Visita> listarVisita();

	Visita guardarVisita(Visita visit);

	Visita actualizarVisita(Visita visit);

	void eliminarVisita(int id);

	List<Visita> listarVisitasXClientes(Clientes cliente);

	List<Visita> listarVisitasXOdontologo(Odontologo odontologo);

}
