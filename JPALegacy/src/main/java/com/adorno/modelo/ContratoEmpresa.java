package com.adorno.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="contrato_empresa")
public class ContratoEmpresa {
	@Id
	@JoinColumn(name="id_contrato")
	@ManyToOne
	public Contrato contrato;
	@Id
	@JoinColumn(name="id_empresa")
	@ManyToOne
	public Empresa empresa;
	public LocalDate fechaColaboracion;
}
