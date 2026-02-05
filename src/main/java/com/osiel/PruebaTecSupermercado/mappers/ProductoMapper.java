package com.osiel.PruebaTecSupermercado.mappers;

import com.osiel.PruebaTecSupermercado.dtos.ProductoDTO;
import com.osiel.PruebaTecSupermercado.models.Producto;

public class ProductoMapper {
    public static ProductoDTO toDTO(Producto producto){
        if(producto == null) return null;

        return ProductoDTO.builder()
                .id(producto.getId())
                .nombre(producto.getNombre())
                .categoria(producto.getCategoria())
                .precio(producto.getPrecio())
                .build();
    }
}
