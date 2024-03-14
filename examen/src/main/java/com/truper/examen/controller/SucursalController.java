package com.truper.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truper.examen.model.Orden;
import com.truper.examen.model.Sucursal;
import com.truper.examen.service.OrdenesService;
import com.truper.examen.service.SucursalService;

@RestController
@RequestMapping("/api")
public class SucursalController {
	@Autowired
	private SucursalService sucursalService;

	@PostMapping("/sucursales")
	public Sucursal saveSucursal(@RequestBody Sucursal suc) {
		return sucursalService.saveSucursal(suc);
	}

	@GetMapping("/sucursales/{id}")
	public Sucursal updateOrden( @PathVariable("id") Long id) {
		return sucursalService.getSucursalById(id);
	}
}
