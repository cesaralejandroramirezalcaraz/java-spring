package com.dev.api.persistence;

import com.dev.api.persistence.crud.ProductoCrudRepository;
import com.dev.api.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
  private ProductoCrudRepository productoCrudRepository;


    public List<Producto> getAll(){
       return (List<Producto>) productoCrudRepository.findAll();

    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoria(idCategoria);
    }

    public Optional<List<Producto>>getEscasos(int cantidad, boolean estado ){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }


}
