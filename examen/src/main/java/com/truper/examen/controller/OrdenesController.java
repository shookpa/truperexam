package com.truper.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.examen.model.Orden;
import com.truper.examen.service.OrdenesService;

@RestController
@RequestMapping("/api")
public class OrdenesController {
	@Autowired
	private OrdenesService ordenService;

	@PostMapping("/ordenes")
	public Orden saveDepartment(@RequestBody Orden orden) {
		return ordenService.saveOrden(orden);
	}

	@GetMapping("/ordenes/{id}")
	public Orden updateOrden( @PathVariable("id") Long id) {
		return ordenService.getOrdenById(id);
	}
}
