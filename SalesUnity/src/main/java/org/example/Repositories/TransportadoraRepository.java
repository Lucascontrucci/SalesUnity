package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Transportadora;

public class TransportadoraRepository extends JpaRepository<Transportadora>{

    public TransportadoraRepository(EntityManager entityManager, Class<Transportadora> entityType) {
        super(entityManager, entityType);
    }
}
