package com.adorno.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="socio_cooperativa")
public class Socio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_socio")
	private Long id; 
	@Column(name="name_socio")
	private String nombre;
	@ManyToMany(mappedBy = "socios")
	private List<Propiedad> propiedades;
	public Socio(String nombre) {
		super();
		this.nombre = nombre;
	}
	
}
