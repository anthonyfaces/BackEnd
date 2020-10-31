package com.pe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pe.model.Venta;
import com.pe.repo.IGenericRepo;
import com.pe.repo.IVentaRepo;
import com.pe.service.IVentaService;

@Service
public class VentaServiceImpl extends CrudImpl<Venta, Integer> implements IVentaService{
	
	@Autowired
	private IVentaRepo repo;

	@Override
	protected IGenericRepo<Venta, Integer> getRepo() {
		return repo;
	}
	
	@Transactional
	@Override
	public Venta registrarTransaccional(Venta venta) throws Exception {
		venta.getDetalleVenta().forEach(det -> det.setVenta(venta));
		
		repo.save(venta);
		return venta;
	}

}
