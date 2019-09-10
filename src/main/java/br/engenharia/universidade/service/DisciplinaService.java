package br.engenharia.universidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.Disciplina;
import br.engenharia.universidade.repository.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository repository;
	
	public Disciplina cadastrar(Disciplina disciplina) {
		return repository.save(disciplina);
	}
	
	public List<Disciplina> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Disciplina> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;		
	}
	
	public Disciplina alterar(Long id, Disciplina disciplina) {
		if (repository.existsById(id)) {
			return repository.save(disciplina);
		}
		
		return new Disciplina();
	}
	
	public boolean existe(Long id) {
		return repository.existsById(id);
	}
	
	public List<Disciplina> buscarPorNome(String nome) {
		return repository.buscarPorNome(nome);
	}
}
