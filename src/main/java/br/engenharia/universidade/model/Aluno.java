package br.engenharia.universidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity		//Anotação JPA que reconhece a classe como uma entidade de mesmo nome no banco de dados
@Table		//Anotação JPA que cria uma tabela de mesmo nome no banco de dados
public class Aluno {

	@Id		//Anotação que identifica atributo como PK
	@GeneratedValue(strategy = GenerationType.SEQUENCE)	//Anotação que especifica como será feito a geração PK (Sequencial)
	private Long id;
	@NotNull	//Anotação para não permitir PK nula
	@Column(length = 100)	//Anotação que define atributo como tabela no banco de dados, com mesmo nome e tamanho de 100 caracteres
	private String nome;
	@NotNull
	@Column(length = 100)
	private String matricula;
	@Column
	private String email;
	@Column
	private String telefone;
	@Column(length = 14)
	private String cpf;
	
	//Getters e Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
