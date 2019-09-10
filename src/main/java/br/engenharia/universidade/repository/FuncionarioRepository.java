package br.engenharia.universidade.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.engenharia.universidade.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	@Query("from Funcionario where lower(nome) like lower(concat(?1, '%'))")
	List<Funcionario> buscarPorNome(String nome);
}
