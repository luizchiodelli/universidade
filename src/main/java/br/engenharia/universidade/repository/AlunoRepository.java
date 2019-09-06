package br.engenharia.universidade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.engenharia.universidade.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
