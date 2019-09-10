package br.engenharia.universidade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(length = 60)
	private String emailAcademico;
	@Column
	private Integer coordenador;
	@Column
	private String formacaoAcademica;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmailAcademico() {
		return emailAcademico;
	}
	public void setEmailAcademico(String emailAcademico) {
		this.emailAcademico = emailAcademico;
	}
	public Integer getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Integer coordenador) {
		this.coordenador = coordenador;
	}
	public String getFormacaoAcademica() {
		return formacaoAcademica;
	}
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
}
