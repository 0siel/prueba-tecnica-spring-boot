package com.osiel.PruebaTecSupermercado.dtos;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleVentaDTO {
    private Long id;

    private Long idProducto;

    private String nombreProducto;

    private Integer cantidad;

    private Double precioUnitario;

    private Double subtotal;
}
