package org.cibertec.edu.pe.service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaces.iProducto;
import org.cibertec.edu.pe.interfaceservice.IProductoService;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private iProducto data;

	@Override
	public List<Producto> Listado() {
		return (List<Producto>)data.findAll();
	}

	@Override
	public Optional<Producto> Buscar(int id) {
		return data.findById(id);
	}

	@Override
	public void Insertar(Producto p) {
		data.save(p);  //En el caso que el registro NO exista lo agrega
		               //En el caso que el registro SI exista lo modifica
	}

	@Override
	public void Modificar(Producto p) {
		data.save(p);
	}

	@Override
	public void Suprimir(int id) {
		data.deleteById(id);
		
	}
	


}
