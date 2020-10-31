package com.pe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.model.Persona;
import com.pe.repo.IGenericRepo;
import com.pe.repo.IPersonaRepo;
import com.pe.service.IPersonaService;

@Service
public class PersonaServiceImpl extends CrudImpl<Persona, Integer> implements IPersonaService{
	
	@Autowired
	private IPersonaRepo repo;

	@Override
	protected IGenericRepo<Persona, Integer> getRepo() {
		return repo;
	}

}
