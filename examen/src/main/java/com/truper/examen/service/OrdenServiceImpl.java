package com.truper.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.examen.model.Orden;
import com.truper.examen.repo.OrdenRepository;

@Service
public class OrdenServiceImpl implements OrdenesService {
	 @Autowired
	 private OrdenRepository ordenRepository;
	 
	@Override
    public Orden saveOrden(Orden orden)
    {
        return ordenRepository.save(orden);
    }

	@Override
	public Orden getOrdenById(Long ordenId) {
		Orden ordDB
         = ordenRepository.findById(ordenId)
               .get();
		return ordDB;
	}
}
