package io.oculosdanilo.sebrae.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("api")
	public String executarApi() {
		return "olá mundinho limdo §;-P)<br />api executada com sucexo";
	}
}
