package br.engenharia.universidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.Curso;
import br.engenharia.universidade.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository repository;
	
	public Curso cadastrar(Curso curso) {
		return repository.save(curso);
	}
	
	public List<Curso> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Curso> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;		
	}
	
	public Curso alterar(Long id, Curso curso) {
		if (repository.existsById(id)) {
			return repository.save(curso);
		}
		
		return new Curso();
	}
	
	public boolean existe(Long id) {
		return repository.existsById(id);
	}
	
	public List<Curso> buscarPorNome(String nome) {
		return repository.buscarPorNome(nome);
	}
}
