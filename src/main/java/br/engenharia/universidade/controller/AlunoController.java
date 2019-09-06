package br.engenharia.universidade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.engenharia.universidade.model.Aluno;
import br.engenharia.universidade.service.AlunoService;

@RestController
@RequestMapping("aluno")
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@PostMapping
	public ResponseEntity<Aluno> cadastrar(@RequestBody Aluno aluno){
		return ResponseEntity.ok(service.cadastrar(aluno));
	}
}
