package com.aljimez.EX02C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.EX02C4.dao.IClientesDAO;
import com.aljimez.EX02C4.dto.Clientes;
import com.aljimez.EX02C4.dto.Visita;

@Service
public class ClientesServiceImpl implements IClientesService{

	
	@Autowired
	IClientesDAO iClientesDAO;

	@Override
	public List<Clientes> listarClientes() {
		// TODO Auto-generated method stub
		return iClientesDAO.findAll();
	}

	@Override
	public Clientes guardarClients(Clientes clients) {
		// TODO Auto-generated method stub
		return iClientesDAO.save(clients);
	}

	@Override
	public Clientes clientesXID(int id) {
		// TODO Auto-generated method stub
		return iClientesDAO.findById(id).get();
	}

	@Override
	public Clientes actualizarClients(Clientes clients) {
		// TODO Auto-generated method stub
		return iClientesDAO.save(clients);
	}

	@Override
	public void eliminarClients(int id) {
		// TODO Auto-generated method stub
		iClientesDAO.deleteById(id);
	}

	public Clientes saveCliente(Clientes client) {
		// TODO Auto-generated method stub
		return iClientesDAO.save(client);
	}

	public List<Visita> listarVisitaXClientes(Clientes clientesXID) {
		// TODO Auto-generated method stub
		return iClientesDAO.findByCliente(clientesXID);
	}

}
