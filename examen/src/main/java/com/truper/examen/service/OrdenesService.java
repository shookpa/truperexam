package com.truper.examen.service;

import com.truper.examen.model.Orden;

public interface OrdenesService {
	Orden saveOrden(Orden orden);
	Orden getOrdenById(Long ordenId);
}
