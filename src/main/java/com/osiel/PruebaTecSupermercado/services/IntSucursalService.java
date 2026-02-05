package com.osiel.PruebaTecSupermercado.services;

import com.osiel.PruebaTecSupermercado.dtos.SucursalDTO;
import com.osiel.PruebaTecSupermercado.models.Sucursal;

import java.util.List;

public interface IntSucursalService {
    List<SucursalDTO> listarSucursales();
    SucursalDTO crearSucursal(Sucursal sucursal);
    SucursalDTO actualizarSucursal(Long id, SucursalDTO sucursalDTO);
    void eliminarSucursal(Long id);

}
