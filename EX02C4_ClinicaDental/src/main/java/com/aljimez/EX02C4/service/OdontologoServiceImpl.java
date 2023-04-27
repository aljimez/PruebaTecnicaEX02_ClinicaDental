package com.aljimez.EX02C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.EX02C4.dao.IOdontologoDAO;
import com.aljimez.EX02C4.dto.Odontologo;
import com.aljimez.EX02C4.dto.Visita;

@Service
public class OdontologoServiceImpl implements IOdontologoService {

	@Autowired
	IOdontologoDAO iOdontologoDAO;

	@Override
	public List<Odontologo> listarOdontologo() {
		// TODO Auto-generated method stub
		return iOdontologoDAO.findAll();
	}

	@Override
	public Odontologo guardarOdontologo(Odontologo odontologist) {
		// TODO Auto-generated method stub
		return iOdontologoDAO.save(odontologist);
	}

	@Override
	public Odontologo odontologoXID(int id) {
		// TODO Auto-generated method stub
		return iOdontologoDAO.findById(id).get();
	}

	@Override
	public Odontologo actualizarOdontologo(Odontologo odontologist) {
		// TODO Auto-generated method stub
		return iOdontologoDAO.save(odontologist);
	}

	@Override
	public void eliminarOdontologo(int id) {
		// TODO Auto-generated method stub
		iOdontologoDAO.deleteById(id);
	}

}
