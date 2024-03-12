package com.adorno.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "propiedad_data")
public class Propiedad {
	@Id
	@Column(name = "id_propiedad")
	private Long id;
	@Column(name = "referencia_propiedad")
	private String referencia;
	@ManyToMany
	@JoinTable(name="prop_soc",
	joinColumns = {
			@JoinColumn(name="prop_id")
	},inverseJoinColumns = {
			@JoinColumn(name="socio_id")
	})
	private List<Socio> socios;
	public Propiedad(String referencia) {
		super();
		this.referencia = referencia;
	}

}
