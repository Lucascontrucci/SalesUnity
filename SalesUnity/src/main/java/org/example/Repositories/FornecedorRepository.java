package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Fornecedor;


public class FornecedorRepository extends JpaRepository<Fornecedor>{

    public FornecedorRepository(EntityManager entityManager, Class<Fornecedor> entityType) {
        super(entityManager, entityType);
    }
}
