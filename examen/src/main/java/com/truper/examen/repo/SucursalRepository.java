package com.truper.examen.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.truper.examen.model.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal,Long>{
	
	 Sucursal findById(long id);
}
