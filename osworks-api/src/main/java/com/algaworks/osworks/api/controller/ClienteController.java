package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João das couves");
		cliente1.setTelefone("98 982297980");
		cliente1.setEmail("joaodascouves@gmail.com");
		
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("98 982297879");
		cliente2.setEmail("lay@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
	

}
