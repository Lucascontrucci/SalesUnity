package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Produto;


public class ProdutoRepository extends JpaRepository<Produto>{

    public ProdutoRepository(EntityManager entityManager, Class<Produto> entityType) {
        super(entityManager, entityType);
    }
}
