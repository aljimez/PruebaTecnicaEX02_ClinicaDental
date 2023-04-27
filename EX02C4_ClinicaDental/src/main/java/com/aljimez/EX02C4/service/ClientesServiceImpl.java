package com.aljimez.EX02C4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aljimez.EX02C4.dao.IClientesDAO;
import com.aljimez.EX02C4.dto.Clientes;

@Service
public class ClientesServiceImpl implements IClientesService{

	
	@Autowired
	IClientesDAO iClientDAO;

	@Override
	public List<Clientes> listarClients() {
		// TODO Auto-generated method stub
		return iClientDAO.findAll();
	}

	@Override
	public Clientes guardarClients(Clientes clients) {
		// TODO Auto-generated method stub
		return iClientDAO.save(clients);
	}

	@Override
	public Clientes clientsXID(int id) {
		// TODO Auto-generated method stub
		return iClientDAO.findById(id).get();
	}

	@Override
	public Clientes actualizarClients(Clientes clients) {
		// TODO Auto-generated method stub
		return iClientDAO.save(clients);
	}

	@Override
	public void eliminarClients(int id) {
		// TODO Auto-generated method stub
		iClientDAO.deleteById(id);
	}

	public Clientes saveCliente(Clientes client) {
		// TODO Auto-generated method stub
		return iClientDAO.save(client);
	}

}
