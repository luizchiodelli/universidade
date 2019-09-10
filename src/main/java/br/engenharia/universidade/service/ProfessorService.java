package br.engenharia.universidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.Professor;
import br.engenharia.universidade.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repository;

	public Professor cadastrar(Professor professor) {
		return repository.save(professor);
	}
	
	public List<Professor> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Professor> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;		
	}
	
	public Professor alterar(Long id, Professor professor) {
		if (repository.existsById(id)) {
			return repository.save(professor);
		}
		
		return new Professor();
	}
	
	public boolean existe(Long id) {
		return repository.existsById(id);
	}
}
