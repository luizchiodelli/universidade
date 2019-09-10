package br.engenharia.universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.engenharia.universidade.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
