package com.aljimez.EX02C4.service;

import java.util.List;

import com.aljimez.EX02C4.dto.Odontologo;

public interface IOdontologoService {

//CRUD Odontologo
	Odontologo guardarOdontologo(Odontologo odontologo);

	Odontologo actualizarOdontologo(Odontologo odontologo);

	List<Odontologo> listarOdontologo();

	void eliminarOdontologo(int id);

	Odontologo odontologoXID(int id);

}
