package com.luisfer.proyectlfn.dominio.repository;

import com.luisfer.proyectlfn.dominio.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);
}
