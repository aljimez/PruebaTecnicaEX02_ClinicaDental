package com.aljimez.EX02C4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aljimez.EX02C4.dto.Odontologo;
import com.aljimez.EX02C4.dto.Visita;

public interface IOdontologoDAO extends JpaRepository<Odontologo, Integer>{

	List<Visita> findByOdontologo(int id);
	List<Visita> findVisitsXOdontologo(Long odontologoId);


}
