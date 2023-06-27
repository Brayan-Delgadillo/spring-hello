package com.delgadillo.hello.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delgadillo.hello.model.Reporte;

@RestController
public class ReporteController {
	
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/reporte")
	public Reporte reporte(@RequestParam(value = "nombre", defaultValue = "Anonimo") String nombre,
			@RequestParam(value = "mensaje", defaultValue = "-") String mensaje) {
		return new Reporte(counter.incrementAndGet(), nombre, mensaje);
	}
}
