package com.truper.examen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truper.examen.model.Orden;

public interface OrdenRepository extends JpaRepository<Orden,Long>{
	
	 Orden findById(long id);
}
