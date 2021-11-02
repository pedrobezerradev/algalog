package com.algaworks.algalog.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {

		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Pedro2");
		cliente1.setTelefone("111111111");
		cliente1.setEmail("pedro@pedro.com");

		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Camila");
		cliente2.setTelefone("222222222");
		cliente2.setEmail("camila@camila.com");

		return Arrays.asList(cliente1, cliente2);
	}
}
