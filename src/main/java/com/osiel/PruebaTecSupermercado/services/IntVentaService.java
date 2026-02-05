package com.osiel.PruebaTecSupermercado.services;

import com.osiel.PruebaTecSupermercado.dtos.VentaDTO;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface IntVentaService {
    List<VentaDTO> listarVentas();
    VentaDTO crearVenta(VentaDTO ventaDTO);
    VentaDTO actualizarVenta(Long id, VentaDTO ventaDTO);
    void eliminarventa(Long id);
}
