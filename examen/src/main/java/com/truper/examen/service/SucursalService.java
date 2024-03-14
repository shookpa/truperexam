package com.truper.examen.service;

import com.truper.examen.model.Orden;
import com.truper.examen.model.Sucursal;

public interface SucursalService {
	Sucursal saveSucursal(Sucursal orden);
	Sucursal getSucursalById(Long ordenId);
}
