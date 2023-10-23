package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Cliente;

public class ClienteRepository extends JpaRepository<Cliente>{

    public ClienteRepository(EntityManager entityManager, Class<Cliente> entityType) {
        super(entityManager, entityType);
    }
}
