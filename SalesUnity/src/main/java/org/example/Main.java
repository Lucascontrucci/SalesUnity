package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Repositories.UsuarioRepository;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oracle");
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            var usuarioRepository = new UsuarioRepository(entityManager);

            entityManager.close();
            entityManagerFactory.close();
        } catch (Exception e) {
            throw e;
        }
    }
}