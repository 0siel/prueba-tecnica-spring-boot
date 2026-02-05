package com.osiel.PruebaTecSupermercado.services;

import com.osiel.PruebaTecSupermercado.dtos.ProductoDTO;

import java.util.List;

public interface IntProductService {
    List<ProductoDTO> listarProductos();
    ProductoDTO crearProducto(ProductoDTO productoDTO);
    ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO);
    void eliminarProducto(Long id);
}
