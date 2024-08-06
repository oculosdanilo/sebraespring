package io.oculosdanilo.sebrae.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.oculosdanilo.sebrae.dto.Usuario;

@RestController
public class ApiController {

	@GetMapping("api")
	public String executarApi() {
		return "olá mundinho limdo §;-P)<br />api executada com sucesso";
	}

	@PostMapping("cadastro-usuario")
	public ResponseEntity<?> cadastrarUsuario(@RequestBody Usuario user) {
		System.out.println(user.toString());
		return ResponseEntity.ok("cadastrou, beijos");
	}
}
