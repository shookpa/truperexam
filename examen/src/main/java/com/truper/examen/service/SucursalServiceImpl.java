package com.truper.examen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truper.examen.model.Sucursal;
import com.truper.examen.repo.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService {
	 @Autowired
	 private SucursalRepository sucursalRepository;
	 
	@Override
    public Sucursal saveSucursal(Sucursal sucursal)
    {
        return sucursalRepository.save(sucursal);
    }

	@Override
	public Sucursal getSucursalById(Long sucursalId) {
		Sucursal ordDB
         = sucursalRepository.findById(sucursalId)
               .get();
		return ordDB;
	}
}
