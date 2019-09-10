package br.engenharia.universidade.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.Funcionario;
import br.engenharia.universidade.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository repository;

	public Funcionario cadastrar(Funcionario funcionario) {
		return repository.save(funcionario);
	}
	
	public List<Funcionario> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Funcionario> buscarPorId(Long id) {
		return repository.findById(id);
	}
	
	public void deletar(Long id) {
		repository.deleteById(id);;		
	}
	
	public Funcionario alterar(Long id, Funcionario funcionario) {
		if (repository.existsById(id)) {
			return repository.save(funcionario);
		}
		
		return new Funcionario();
	}
	
	public boolean existe(Long id) {
		return repository.existsById(id);
	}
	
	public List<Funcionario> buscarPorNome(String funcionario) {
		return repository.buscarPorNome(funcionario);
	}
}
