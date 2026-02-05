package com.osiel.PruebaTecSupermercado.services;

import com.osiel.PruebaTecSupermercado.dtos.ProductoDTO;
import com.osiel.PruebaTecSupermercado.exceptions.NotFoundException;
import com.osiel.PruebaTecSupermercado.mappers.ProductoMapper;
import com.osiel.PruebaTecSupermercado.models.Producto;
import com.osiel.PruebaTecSupermercado.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProductoService implements IntProductService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<ProductoDTO> listarProductos() {
        return productoRepository.findAll().stream().map(ProductoMapper::toDTO).toList();
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        Producto producto = Producto.builder()
                .nombre(productoDTO.getNombre())
                .categoria(productoDTO.getCategoria())
                .precio(productoDTO.getPrecio())
                .cantidad(productoDTO.getCantidad()).build();

        return ProductoMapper.toDTO(productoRepository.save(producto));
    }

    @Override
    public ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO) {
        Producto producto = getProductoOrThrow(id);

        producto.setNombre(productoDTO.getNombre());
        producto.setCategoria(productoDTO.getCategoria());
        producto.setCantidad(productoDTO.getCantidad());
        producto.setPrecio(productoDTO.getPrecio());

        Producto updatedProducto = productoRepository.save(producto);

        return ProductoMapper.toDTO(updatedProducto);

    }

    @Override
    public void eliminarProducto(Long id) {
        Producto productoToDelete = getProductoOrThrow(id);
        productoRepository.delete(productoToDelete);

    }

    private Producto getProductoOrThrow(Long id){
        return productoRepository.findById(id).orElseThrow(() -> new NotFoundException("No se encontró el producto con el id: " + id));
    }
}
