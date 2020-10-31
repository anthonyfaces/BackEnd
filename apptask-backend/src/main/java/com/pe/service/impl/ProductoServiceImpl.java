package com.pe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.model.Producto;
import com.pe.repo.IGenericRepo;
import com.pe.repo.IProductoRepo;
import com.pe.service.IProductoService;

@Service
public class ProductoServiceImpl extends CrudImpl<Producto, Integer> implements IProductoService{
	
	@Autowired
	private IProductoRepo repo;

	@Override
	protected IGenericRepo<Producto, Integer> getRepo() {
		return repo;
	}

}
