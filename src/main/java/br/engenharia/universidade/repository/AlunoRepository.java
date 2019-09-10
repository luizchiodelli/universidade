package br.engenharia.universidade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.engenharia.universidade.model.Aluno;

@Repository		//Anotação que reconhece interface como um repositório de acesso de dados CRUD (Create, Read, Update, Delete)
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	@Query("from Aluno where lower(nome) like lower(concat(?1, '%'))")
	List<Aluno> buscarPorNome(String nome);
	
	@Query("from Aluno where matricula like concat(?1, '%')")
	List<Aluno> buscarPorMatricula(String matricula);
}
