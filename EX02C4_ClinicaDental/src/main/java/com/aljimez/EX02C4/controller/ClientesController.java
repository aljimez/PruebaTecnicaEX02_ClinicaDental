package com.aljimez.EX02C4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aljimez.EX02C4.dto.Clientes;
import com.aljimez.EX02C4.dto.Visita;
import com.aljimez.EX02C4.service.ClientesServiceImpl;
import com.aljimez.EX02C4.service.OdontologoServiceImpl;
import com.aljimez.EX02C4.service.VisitaServiceImpl;

@RestController
@RequestMapping("/api")
public class ClientesController {

	@Autowired
	ClientesServiceImpl clientServiceImpl;

	@Autowired
	OdontologoServiceImpl odontologistServiceImpl;

	@Autowired
	VisitaServiceImpl visitaServiceImpl;

	@GetMapping("/clientes")
	public List<Clientes> listClients() {
		return clientServiceImpl.listarClientes();
	}

//Acceso a perfil de usuario por ID
	@GetMapping("/clientes/{id}")
	public Clientes clientById(@PathVariable(name = "id") int id) {
		Clientes clientxID = new Clientes();
		clientxID = clientServiceImpl.clientsXID(id);
		return clientxID;
	}

	// Get list of visits for client
	@GetMapping("/clientes/{id}/visitas")
	public List<Visita> listarVisitasXClientes(@PathVariable(name = "id") Clientes clientes) {
		return visitaServiceImpl.listarVisitasXClientes(clientes);

	}

	// Post Mappings
	@PostMapping("/clientes")
	public Clientes saveClient(@RequestBody Clientes client) {
		return clientServiceImpl.saveCliente(client);
	}

	@PutMapping("/clientes/{id}")
	public Clientes updateClients(@PathVariable(name = "id") int id, @RequestBody Clientes clients) {

		Clientes Clients_selected = new Clientes();
		Clientes Clients_updated = new Clientes();

		Clients_selected = clientServiceImpl.clientsXID(id);
		Clients_selected.setName(clients.getName());
		Clients_selected.setPhoneNum(clients.getPhoneNum());
		Clients_selected.setDni(clients.getDni());
		Clients_selected.setEmail(clients.getEmail());

		Clients_selected = clientServiceImpl.clientsXID(id);

		return Clients_updated;
	}

	// Delete Mappings
	@DeleteMapping("/clientes/{id}")
	public void delClient(@PathVariable(name = "id") int id) {
		clientServiceImpl.eliminarClients(id);
	}

}
