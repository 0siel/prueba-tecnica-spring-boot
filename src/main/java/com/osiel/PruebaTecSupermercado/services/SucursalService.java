package com.osiel.PruebaTecSupermercado.services;

import com.osiel.PruebaTecSupermercado.dtos.SucursalDTO;
import com.osiel.PruebaTecSupermercado.models.Sucursal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SucursalService implements IntSucursalService {
    @Override
    public List<SucursalDTO> listarSucursales() {
        return List.of();
    }

    @Override
    public SucursalDTO crearSucursal(Sucursal sucursal) {
        return null;
    }

    @Override
    public SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDTO) {
        return null;
    }

    @Override
    public void eliminarSucursal(Long id) {

    }
}
