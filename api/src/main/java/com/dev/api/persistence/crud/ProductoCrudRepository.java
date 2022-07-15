package com.dev.api.persistence.crud;

import com.dev.api.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {
  //  @Query(value = "SELECT * FORM productos WHERE id_categoria = ? ", nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategoria);

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStok, boolean estado);
}
