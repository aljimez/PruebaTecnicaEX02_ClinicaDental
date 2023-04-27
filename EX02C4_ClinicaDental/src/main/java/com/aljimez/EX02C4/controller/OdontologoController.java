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
import com.aljimez.EX02C4.dto.Odontologo;
import com.aljimez.EX02C4.dto.Visita;
import com.aljimez.EX02C4.service.ClientesServiceImpl;
import com.aljimez.EX02C4.service.OdontologoServiceImpl;
import com.aljimez.EX02C4.service.VisitaServiceImpl;

@RestController // Rest controller
@RequestMapping("/api")
public class OdontologoController {

	// Implement service
	@Autowired
	OdontologoServiceImpl odontologoServiceImpl;

	// Implement visit service
	@Autowired
	VisitaServiceImpl visitaServiceImpl;

	@Autowired
	ClientesServiceImpl clientesServiceImpl;

	// Get Mappings
	@GetMapping("/odontologo")
	public List<Odontologo> listOdontologists() {
		return odontologoServiceImpl.listarOdontologo();
	}

	@GetMapping("/odontologo/{id}")
	public Odontologo odontologistXId(@PathVariable(name = "id") int id) {
		Odontologo odontologoxID = new Odontologo();

		odontologoxID = odontologoServiceImpl.odontologoXID(id);

		return odontologoxID;
	}

	@GetMapping("/odontologo/clientes")
	public List<Clientes> listarClientes() {
		return clientesServiceImpl.listarClientes();

	}

	@PostMapping("/odontologo")
	public Odontologo saveOdontologist(@RequestBody Odontologo odontologo) {
		return odontologoServiceImpl.guardarOdontologo(odontologo);
	}
	
	@GetMapping("/odontologo/visitas")
	public List<Visita> listarVisitas(){
		return visitaServiceImpl.listarVisita();
	}

	@PutMapping("/odontologo/{id}")
	public Odontologo updateOdontologist(@PathVariable(name = "id") Long id, @RequestBody Odontologo odontologo) {
		Odontologo Odontologoselecc = new Odontologo(id, odontologo.getDni(), odontologo.getName(),
				odontologo.getPhoneNum(), odontologo.getEmail(),odontologo.getOdontologo());
		Odontologo Odonrologoactu = odontologoServiceImpl.actualizarOdontologo(Odontologoselecc);
		return Odonrologoactu;
	

	}

	// Delete Mappings
	@DeleteMapping("/odontologo/{id}")
	public void deleteOdontologist(@PathVariable(name = "id") int id) {
		odontologoServiceImpl.eliminarOdontologo(id);
	}
}
