package br.engenharia.universidade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.engenharia.universidade.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	@Query("from Curso where lower(nome) like lower(concat(?1, '%'))")
	List<Curso> buscarPorNome(String nome);
}
