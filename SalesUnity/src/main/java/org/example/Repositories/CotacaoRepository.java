package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Cotacao;


public class CotacaoRepository extends JpaRepository<Cotacao>{

    public CotacaoRepository(EntityManager entityManager, Class<Cotacao> entityType) {
        super(entityManager, entityType);
    }
}
