package com.adorno.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="empresa_colaboradora")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_empresa")
	private Long id; 
	@Column(name="nombre_empresa")
	private String nombre;
	
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
	}
	

}
