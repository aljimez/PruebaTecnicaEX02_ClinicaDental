package com.aljimez.EX02C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.EX02C4.dao.IOdontologoDAO;
import com.aljimez.EX02C4.dto.Odontologo;

@Service
public class OdontologoServiceImpl implements IOdontologoService {

	@Autowired
	IOdontologoDAO iOdontologistDAO;

	@Override
	public List<Odontologo> listarOdontologo() {
		// TODO Auto-generated method stub
		return iOdontologistDAO.findAll();
	}

	@Override
	public Odontologo guardarOdontologo(Odontologo odontologist) {
		// TODO Auto-generated method stub
		return iOdontologistDAO.save(odontologist);
	}

	@Override
	public Odontologo odontologoXID(int id) {
		// TODO Auto-generated method stub
		return iOdontologistDAO.findById(id).get();
	}

	@Override
	public Odontologo actualizarOdontologo(Odontologo odontologist) {
		// TODO Auto-generated method stub
		return iOdontologistDAO.save(odontologist);
	}

	@Override
	public void eliminarOdontologo(int id) {
		// TODO Auto-generated method stub
		iOdontologistDAO.deleteById(id);
	}

}
