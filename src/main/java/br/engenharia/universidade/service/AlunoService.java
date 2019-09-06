package br.engenharia.universidade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.engenharia.universidade.model.Aluno;
import br.engenharia.universidade.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;

	public Aluno cadastrar(Aluno aluno) {
		return repository.save(aluno);
	}
}
