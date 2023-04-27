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

import com.aljimez.EX02C4.dto.Odontologo;
import com.aljimez.EX02C4.dto.Visita;
import com.aljimez.EX02C4.service.OdontologoServiceImpl;
import com.aljimez.EX02C4.service.VisitaServiceImpl;


@RestController // Rest controller
@RequestMapping("/api")
public class OdontologoController {
	
	// Implement service
		@Autowired
		OdontologoServiceImpl odontologistServiceImpl;

		// Implement visit service
		@Autowired
		VisitaServiceImpl visitServiceImpl;
		

		// Get Mappings
		@GetMapping("/odontologo")
		public List<Odontologo> listOdontologists() {
			return odontologistServiceImpl.listarOdontologo();
		}

		@GetMapping("/odontologo/{id}")
		public Odontologo odontologistById(@PathVariable(name = "id") int id) {
			Odontologo odontologoxID = new Odontologo();

			odontologoxID = odontologistServiceImpl.odontologoXID(id);

			return odontologoxID;
		}
		

		// Get list of visits for odontologist
		@GetMapping("/odontologo/{odontologistId}/visita")
		public List<Visita> listVisitsByOdontologistId(@PathVariable(name = "odontologoId") Long odontologoId) {
			return visitServiceImpl.listVisitsXOdontologoId(odontologoId);

		}
		
		@PostMapping("/odontologo")
		public Odontologo saveOdontologist(@RequestBody Odontologo odontologist) {
			return odontologistServiceImpl.guardarOdontologo(odontologist);
		}
		
		@PutMapping("/odontologo/{id}")
		public Odontologo updateOdontologist(@PathVariable(name = "id") Long id, @RequestBody Odontologo odontologist) {
			Odontologo selectedOdontologist = new Odontologo(id, odontologist.getDni(), odontologist.getName(),
					odontologist.getPhoneNum(), odontologist.getEmail()); 
					Odontologo	updatedOdontologist = odontologistServiceImpl.actualizarOdontologo(selectedOdontologist);
			return updatedOdontologist;
		}

		

		// Delete Mappings
		@DeleteMapping("/odontologo/{id}")
		public void deleteOdontologist(@PathVariable(name = "id") int id) {
			odontologistServiceImpl.eliminarOdontologo(id);
		}
}

