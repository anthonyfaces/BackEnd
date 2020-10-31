package com.pe.service;

import com.pe.model.Venta;

public interface IVentaService extends ICrud<Venta,Integer>{
	
	Venta registrarTransaccional(Venta venta) throws Exception;

}
