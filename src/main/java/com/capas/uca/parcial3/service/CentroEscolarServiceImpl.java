package com.capas.uca.parcial3.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.capas.uca.parcial3.domain.CentroEscolar;
import com.capas.uca.parcial3.domain.Estudiante;
import com.capas.uca.parcial3.repositorie.CentroEscolarRepo;

@Service
public class CentroEscolarServiceImpl implements CentroEscolarService{
	
	@Autowired
	CentroEscolarRepo Repo;
	
	@PersistenceContext(unitName = "capas2")
	EntityManager entityManager;

	@Override
	public List<CentroEscolar> findAll() throws DataAccessException {
		// TODO Auto-generated method stub
		return Repo.mostrarTodos();
	}

	@Override
	public CentroEscolar findOne(Integer code) throws DataAccessException {
		// TODO Auto-generated method stub
		return Repo.getOne(code);
	}

	@Override
	public void insertAndUpdate(CentroEscolar centroEscolar) throws DataAccessException {
		// TODO Auto-generated method stub
		Repo.save(centroEscolar);
	}
}
