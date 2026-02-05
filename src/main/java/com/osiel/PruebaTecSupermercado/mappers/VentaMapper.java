package com.osiel.PruebaTecSupermercado.mappers;

import com.osiel.PruebaTecSupermercado.dtos.DetalleVentaDTO;
import com.osiel.PruebaTecSupermercado.dtos.VentaDTO;
import com.osiel.PruebaTecSupermercado.models.Venta;

import java.util.stream.Collectors;

public class VentaMapper {
    public static VentaDTO toDTO(Venta venta){
        if(venta == null) return null;

        var detalle = venta.getDetalle().stream().map(detalleVenta ->
                DetalleVentaDTO.builder()
                        .id(detalleVenta.getId())
                        .idProducto(detalleVenta.getProducto().getId())
                        .nombreProducto(detalleVenta.getProducto().getNombre())
                        .cantidad(detalleVenta.getCantidad())
                        .precioUnitario(detalleVenta.getPrecio())
                        .subtotal(detalleVenta.getPrecio() * (detalleVenta.getCantidad()))
                        .build()).toList();

        var total = detalle.stream()
                .map(DetalleVentaDTO::getSubtotal)
                .reduce(0.0, Double::sum);

        return VentaDTO.builder()

                .id(venta.getId())
                .fecha(venta.getFecha())
                .estado(venta.getEstado())
                .idSucursal(venta.getSucursal().getId())
                .detalle(detalle).total(total).build();
    }
}
