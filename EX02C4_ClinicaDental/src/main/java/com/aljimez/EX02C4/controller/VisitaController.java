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

import com.aljimez.EX02C4.dto.Visita;
import com.aljimez.EX02C4.service.ClientesServiceImpl;
import com.aljimez.EX02C4.service.OdontologoServiceImpl;
import com.aljimez.EX02C4.service.VisitaServiceImpl;


//Controller define los endpoints de visita
@RestController 
@RequestMapping("/api")
public class VisitaController {
	@Autowired
	VisitaServiceImpl visitServiceImpl;
	
	ClientesServiceImpl clientesServiceImpl;
	
	OdontologoServiceImpl odontologosServiceImpl;

	@GetMapping("/visitas")
	public List<Visita> listVisits() {
		return visitServiceImpl.listarVisita();
	}

	@GetMapping("/visitas/{id}")
	public Visita visitById(@PathVariable(name = "id") int id) {
		Visita visitxID = new Visita();

		visitxID = visitServiceImpl.visitaXID(id);

		return visitxID;
	}

	@PostMapping("/visitas")
	public Visita saveVisit(@RequestBody Visita visit) {
		return visitServiceImpl.guardarVisita(visit);
	}

	@PutMapping("/visitas/{id}")
	public Visita updateVisit(@PathVariable(name = "id") Long id, @RequestBody Visita visits) {
		Visita selectedVisit = new Visita(id, visits.getClients(), 
				visits.getOdontologist(),
				visits.getProceso(),
				visits.getPrices(),
				visits.getTime());
		Visita updatedVisit = new Visita();

		updatedVisit = visitServiceImpl.actualizarVisita(selectedVisit);
		return updatedVisit;
	}
	
	@GetMapping("/visitas/clientes/{id}")
	public List<Visita> visitaXclientesID(@PathVariable(name="id") int id) {

		return clientesServiceImpl.listarVisitaXClientes(clientesServiceImpl.clientesXID(id));
	}
	
	
	@GetMapping ("/visitas/odontologos/{id}")
	public List<Visita> visitaXOdontologosId(@PathVariable (name= "id")int id){
		
		return visitaXOdontologosId(id);
	}
	@DeleteMapping ("/visitas/{id}")
	public void deleteVisit(@PathVariable(name = "id")int id) {
		visitServiceImpl.eliminarVisita(id);
	}

}
