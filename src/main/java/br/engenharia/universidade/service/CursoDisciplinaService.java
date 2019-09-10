package br.engenharia.universidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.CursoDisciplina;
import br.engenharia.universidade.repository.CursoDisciplinaRepository;

@Service
public class CursoDisciplinaService {

	@Autowired
	private CursoDisciplinaRepository repository;
	
	public CursoDisciplina cadastrar(CursoDisciplina cd) {
		return repository.save(cd);
	}
	
	public List<CursoDisciplina> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<CursoDisciplina> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;		
	}
	
	public CursoDisciplina alterar(Long id, CursoDisciplina cd) {
		if (repository.existsById(id)) {
			return repository.save(cd);
		}
		
		return new CursoDisciplina();
	}
	
	public boolean existe(Long id) {
		return repository.existsById(id);
	}
}
