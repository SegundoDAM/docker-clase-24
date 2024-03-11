package com.adorno.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ms-estudiante")
public interface StudentClient {

	String mapping = "estudiante/";

	@GetMapping(mapping + "uno")
	public ResponseEntity<String> getEstudiante();
}
