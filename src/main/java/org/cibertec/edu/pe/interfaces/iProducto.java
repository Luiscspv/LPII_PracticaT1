package org.cibertec.edu.pe.interfaces;

import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//implementacion de la interface IPRODUCTO
public interface iProducto extends JpaRepository<Producto, Integer>{
	
	

}