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

import br.engenharia.universidade.model.Curso;
import br.engenharia.universidade.service.CursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {

	@Autowired
	private CursoService service;
	
	@PostMapping	//Anotação para requisição POST
	public ResponseEntity<Curso> cadastrar(@RequestBody Curso curso) {
		return ResponseEntity.ok(service.cadastrar(curso));
	}
	
	@GetMapping		//Anotação para requisição GET
	public ResponseEntity<List<Curso>> buscarTodos() {
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
	public ResponseEntity alterar(@PathVariable("id") Long id, @RequestBody Curso curso) {
		return ResponseEntity.ok(service.alterar(id, curso));
	}
	
	@GetMapping(path = {"nomes/{nome}"})
	public ResponseEntity buscarPorNome(@PathVariable("nome") String nome, @RequestBody Curso curso) {
		return ResponseEntity.ok(service.buscarPorNome(nome));
	}
}
