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
//Establece los valores de la tabla para acceder desde el controller
@Entity
@Table(name = "odontologos")
public class Odontologo {

	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	private String dni;
	private String name;
	private int phoneNum;
	private String email;
	private String odontologo;
	
	@OneToMany(mappedBy = "odontologos")
	private List<Visita> visit;
	
	public  Odontologo() {}
	
	public Odontologo(Long codigo, String dni, String name, int phoneNum,String email,String odontologo) {
		this.codigo = codigo;
		this.dni = dni;	
		this.name= name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.odontologo = odontologo;
	}
//Getter y Setter
	public Long getCodigo() {
		return codigo;
	}

	
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "visita")
	public List<Visita> getVisit() {
		return visit;
	}

	public void setVisit(List<Visita> visit) {
		this.visit = visit;
	}

	@Override
	public String toString() {
		return "Odontologist [codigo=" + codigo + ", dni=" + dni + ", name=" + name + ", phoneNum=" + phoneNum + ", email="
				+ email + ", visit=" + visit + "]";
	}
	
	

}
