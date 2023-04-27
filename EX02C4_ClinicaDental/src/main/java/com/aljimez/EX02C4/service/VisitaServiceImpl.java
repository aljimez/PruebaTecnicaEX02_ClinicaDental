package com.aljimez.EX02C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.EX02C4.dao.IVisitaDAO;
import com.aljimez.EX02C4.dto.Visita;

@Service
public class VisitaServiceImpl implements IVisitaService {
	@Autowired
	IVisitaDAO iVisitaDAO;

	@Override
	public List<Visita> listarVisita() {
		// TODO Auto-generated method stub
		return iVisitaDAO.findAll();
	}

	@Override
	public Visita guardarVisita(Visita visit) {
		// TODO Auto-generated method stub
		return iVisitaDAO.save(visit);
	}

	@Override
	public Visita visitaXID(int id) {
		// TODO Auto-generated method stub
		return iVisitaDAO.findById(id).get();
	}

	@Override
	public Visita actualizarVisita(Visita visit) {
		// TODO Auto-generated method stub
		return iVisitaDAO.save(visit);
	}

	@Override
	public void eliminarVisita(int id) {
		// TODO Auto-generated method stub
		iVisitaDAO.deleteById(id);
}
	
/*
	@Override
	public List<Visita> listarVisitasXClientes(Clientes clientes) {
		// TODO Auto-generated method stub
		return iVisitaDAO.findVisitasXClientesId(clientes);
}
/*
	public List<Visita> listVisitsXOdontologoId(Long odontologoId) {
		// TODO Auto-generated method stub
		return iVisitaDAO.findVisitsXOdontologoId(odontologoId);
		
}*/

}
