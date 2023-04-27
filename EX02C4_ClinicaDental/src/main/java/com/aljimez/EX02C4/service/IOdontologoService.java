package com.aljimez.EX02C4.service;

import java.util.List;

import com.aljimez.EX02C4.dto.Odontologo;

public interface IOdontologoService {


	Odontologo guardarOdontologo(Odontologo odontologist);

	Odontologo actualizarOdontologo(Odontologo odontologist);

	List<Odontologo> listarOdontologo();

	void eliminarOdontologo(int id);

	Odontologo odontologoXID(int id);

}
