package com.osiel.PruebaTecSupermercado.services;

import com.osiel.PruebaTecSupermercado.dtos.VentaDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService implements IntVentaService{


    @Override
    public List<VentaDTO> listarVentas() {
        return List.of();
    }

    @Override
    public VentaDTO crearVenta(VentaDTO ventaDTO) {
        return null;
    }

    @Override
    public VentaDTO actualizarVenta(Long id, VentaDTO ventaDTO) {
        return null;
    }

    @Override
    public void eliminarventa(Long id) {

    }
}
