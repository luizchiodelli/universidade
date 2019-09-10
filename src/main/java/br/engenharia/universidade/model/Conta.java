package br.engenharia.universidade.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Conta {

	private Long id;
	private String nome;
	private String numero;
	private String banco;
}
