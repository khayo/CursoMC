package br.com.dicasdopinguim.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.dicasdopinguim.cursomc.domain.Categoria;
import br.com.dicasdopinguim.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service; 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ResponseEntity<?> find(){
		List<Categoria> lista = service.listar();
		return ResponseEntity.ok().body(lista);
	}
	
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
	}
	
	
	
}
