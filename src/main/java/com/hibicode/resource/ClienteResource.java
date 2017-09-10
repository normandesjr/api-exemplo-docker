package com.hibicode.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibicode.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@GetMapping
	public List<Cliente> findClientes() {
		return Arrays.asList(new Cliente(1L, "Pedro Silva", "pedro@email.com"),
				new Cliente(2L, "Maria Santos", "maria@email.com"));
	}

}
