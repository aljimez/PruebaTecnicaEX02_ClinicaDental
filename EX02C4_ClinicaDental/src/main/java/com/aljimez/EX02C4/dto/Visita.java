package com.aljimez.EX02C4.dto;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "visitas")
public class Visita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@ManyToOne
	@JoinColumn( name = "clientes_id")
	private Clientes clientes;
	
	@ManyToOne
	@JoinColumn(name = "odontologo_codigo")
	private Odontologo odontologos;
	
	private String proceso;
	

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime time;
	
	private double prices;
	
	public Visita() {}
	public Visita (Long id, Clientes clients,Odontologo odontologo_codigo,String proceso, double prices,LocalDateTime time) {
		
		this.id = id;
		this.clientes = clients;
		this.odontologos = odontologo_codigo;
		this.proceso = proceso;
		this.prices = prices;
		this.time = time;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Clientes getClients() {
		return clientes;
	}
	public void setClients(Clientes clients) {
		this.clientes = clients;
	}
	public Odontologo getOdontologist() {
		return odontologos;
	}
	public void setOdontologist(Odontologo odontologos) {
		this.odontologos = odontologos;
	}
	public String getProceso() {
		return proceso;
	}
	public void setProceso(String proceso) {
		this.proceso = proceso;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public double getPrices() {
		return prices;
	}
	public void setPrices(double prices) {
		this.prices = prices;
	}
	@Override
	public String toString() {
		return "Visit [id=" + id + ", clients=" + clientes + ", odontologist=" + odontologos + ", proceso="
				+ proceso + ", time=" + time + ", prices=" + prices + "]";
	}
	
	
	
}
