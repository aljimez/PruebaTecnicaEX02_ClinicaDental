package com.aljimez.EX02C4.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dni;
	private String name;
	private int phoneNum;
	private String email;
	private Clientes cliente;


	@OneToMany(mappedBy = "cliente")
	private List<Visita> visit;

	public Clientes() {
	}

	public Clientes(Long id, String dni, String name, int phoneNum, String email, List<Visita> visitas,Clientes cliente) {
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.visit = visitas;
		this.cliente = cliente;
	}

	
	
	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "visita")
	public List<Visita> getVisit() {
		return visit;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setVisit(List<Visita> visit) {
		this.visit = visit;
	}

	
	@Override
	public String toString() {
		return "Clients [id=" + id + ", dni=" + dni + ", name=" + name + ", phoneNum=" + phoneNum + ", email=" + email
				+ ", visit=" + visit + "]";
	}

}
