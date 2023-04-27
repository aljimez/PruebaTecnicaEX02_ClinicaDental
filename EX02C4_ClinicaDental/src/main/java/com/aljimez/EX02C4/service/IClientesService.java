package com.aljimez.EX02C4.service;

import java.util.List;

import com.aljimez.EX02C4.dto.Clientes;

public interface IClientesService {

	public List<Clientes> listarClients();

	public Clientes guardarClients(Clientes clients);

	public Clientes actualizarClients(Clientes clients);


	Clientes clientsXID(int id);

	void eliminarClients(int id);

}
