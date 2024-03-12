package com.adorno.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="contrato_data")
public class Contrato {
	@Id
	@Column(name="id_contrato")
	private Long id;
	@Column(name="descripcion_contrato",length = 100)
	private String descripcion;
	@ManyToOne
	@JoinColumn(name="contratos_socio")
	private Socio socio;
	
	public Contrato(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
}
