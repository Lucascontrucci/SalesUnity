package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Compra;

public class CompraRepository extends JpaRepository<Compra>{

    public CompraRepository(EntityManager entityManager, Class<Compra> entityType) {
        super(entityManager, entityType);
    }
}
