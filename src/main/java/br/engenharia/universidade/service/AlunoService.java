package br.engenharia.universidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.Aluno;
import br.engenharia.universidade.repository.AlunoRepository;

@Service	//Anotação que define classe como um serviço, com acesso a regra de negócios do projeto por meio do repositório
public class AlunoService {

	@Autowired	//Anotação para injeção de dependência de atributos obrigatórios, no caso o atributo que dá acesso ao repositório
	private AlunoRepository repository;

	public Aluno cadastrar(Aluno aluno) {
		return repository.save(aluno);
	}
	
	public List<Aluno> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Aluno> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;		
	}
	
	public Aluno alterar(Long id, Aluno aluno) {
		if (repository.existsById(id)) {
			return repository.save(aluno);
		}
		
		return new Aluno();
	}
	
	public boolean existe(Long id) {
		return repository.existsById(id);
	}
	
	public List<Aluno> buscarPorNome(String nome) {
		return repository.buscarPorNome(nome);
	}
	
	public List<Aluno> buscarPorMatricula(String matricula) {
		return repository.buscarPorMatricula(matricula);
	}
}
