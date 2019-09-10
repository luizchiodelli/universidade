package br.engenharia.universidade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.engenharia.universidade.model.Disciplina;
import br.engenharia.universidade.service.DisciplinaService;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

	@Autowired
	private DisciplinaService service;
	
	@PostMapping	//Anotação para requisição POST
	public ResponseEntity<Disciplina> cadastrar(@RequestBody Disciplina disciplina) {
		return ResponseEntity.ok(service.cadastrar(disciplina));
	}
	
	@GetMapping		//Anotação para requisição GET
	public ResponseEntity<List<Disciplina>> buscarTodos() {
		return ResponseEntity.ok(service.buscarTodos());
	}
	
	@GetMapping(path = {"/{id}"})	//Anotação para requisição GET com o caminho especificado
	public ResponseEntity buscarPorId(@PathVariable("id") Long id) {
		return ResponseEntity.ok(service.buscarPorId(id));
	}
	
	@DeleteMapping(path = {"/{id}"})	//Anotação para requisição DELETE
	public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
		if (service.existe(id)) {
			service.deletar(id);
			return ResponseEntity.ok().build();
		}
		
		return ResponseEntity.ok().build();
	}
	
	@PutMapping(value="/{id}")		//Anotação para requisição PUT
	public ResponseEntity alterar(@PathVariable("id") Long id, @RequestBody Disciplina disciplina) {
		return ResponseEntity.ok(service.alterar(id, disciplina));
	}
	
	@GetMapping(path = {"nomes/{nome}"})
	public ResponseEntity buscarPorNome(@PathVariable("nome") String nome, @RequestBody Disciplina disciplina) {
		return ResponseEntity.ok(service.buscarPorNome(nome));
	}
}
