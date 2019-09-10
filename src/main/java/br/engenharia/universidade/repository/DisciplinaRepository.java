package br.engenharia.universidade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.engenharia.universidade.model.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{

	@Query("from Disciplina where lower(nome) like lower(concat(?1, '%'))") 
	List<Disciplina> buscarPorNome(String nome);
}
