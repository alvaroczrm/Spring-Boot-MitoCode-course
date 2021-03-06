package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mitocode.repository.IPersonaRepo;
import com.mitocode.repository.PersonaRepoImpl1;


@Service
public class IPersonaServiceImpl implements IPersonaService{
	
	@Autowired
	@Qualifier("persona1")
	private IPersonaRepo repo;

	@Override
	public void registrar(String nombre) {
		// TODO Auto-generated method stub
		repo = new PersonaRepoImpl1();
		repo.registrar(nombre);
	}

}
