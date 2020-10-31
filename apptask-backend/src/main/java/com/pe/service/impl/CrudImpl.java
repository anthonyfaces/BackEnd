package com.pe.service.impl;

import java.util.List;

import com.pe.repo.IGenericRepo;
import com.pe.service.ICrud;


public abstract class CrudImpl<T, ID> implements ICrud<T, ID>{
	
	protected abstract IGenericRepo<T, ID> getRepo();

	@Override
	public T registrar(T t) throws Exception {
		return getRepo().save(t);
	}

	@Override
	public T modificar(T t) throws Exception {
		return getRepo().save(t);
	}

	@Override
	public List<T> listar() throws Exception {
		return getRepo().findAll();
	}

	@Override
	public T listarPorId(ID id) throws Exception {
		return getRepo().findById(id).orElse(null);
	}

	@Override
	public void eliminar(ID id) throws Exception {
		getRepo().deleteById(id);
		
	}

}
