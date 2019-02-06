package br.com.unifacisa.treinamento.backend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.unifacisa.treinamento.backend.domains.Categoria;
import br.com.unifacisa.treinamento.backend.dtos.CadastrarCategoriaDTO;
import br.com.unifacisa.treinamento.backend.services.CategoriaService;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value = "/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@ApiOperation(value = "Lista Todas as Categorias")
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll() {
		return new ResponseEntity<List<Categoria>>(categoriaService.findAll(), HttpStatus.OK);
	}

	@ApiOperation(value = "Lista Categoria Pelo Id")
	@GetMapping(value = "{id}")
	public ResponseEntity<Categoria> findById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Categoria>(categoriaService.findById(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Insere uma Categoria")
	@RequestMapping(value = "novo", method = RequestMethod.POST)
	public ResponseEntity<Categoria> createCategoria(@Valid @RequestBody CadastrarCategoriaDTO cadastrarCategoria){
		categoriaService.createCategoria(cadastrarCategoria);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Altera uma Categoria")
	@PutMapping(value = "{id}")
	public ResponseEntity<Categoria> updateCategoria(@RequestBody Categoria categoria) {
		categoriaService.updateCategoria(categoria);
		return new ResponseEntity<Categoria>(HttpStatus.OK);
	}

	@ApiOperation(value = "Deleta uma Categoria")
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Categoria> deleteCategoria(@PathVariable(name = "id") Long id) {
		categoriaService.deleteCategoria(id);
		return new ResponseEntity<Categoria>(HttpStatus.OK);
	}
}
