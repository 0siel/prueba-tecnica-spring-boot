package com.osiel.PruebaTecSupermercado.mappers;

import com.osiel.PruebaTecSupermercado.dtos.SucursalDTO;
import com.osiel.PruebaTecSupermercado.models.Sucursal;

public class SucursalMapper {

    public static SucursalDTO toDTO(Sucursal sucursal){
        if(sucursal == null) return null;

        return SucursalDTO.builder()
                .id(sucursal.getId())
                .nombre(sucursal.getNombre())
                .direccion(sucursal.getDirreccion())
                .build();
    }
}
