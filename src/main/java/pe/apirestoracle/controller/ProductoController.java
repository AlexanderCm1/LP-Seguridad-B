package pe.apirestoracle.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.apirestoracle.service.ProductoService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return productoService.readAll();
	}

}
