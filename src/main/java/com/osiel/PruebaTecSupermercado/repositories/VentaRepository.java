package com.osiel.PruebaTecSupermercado.repositories;

import com.osiel.PruebaTecSupermercado.models.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
