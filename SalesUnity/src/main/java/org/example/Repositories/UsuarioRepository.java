package org.example.Repositories;

import jakarta.persistence.EntityManager;
import org.example.Models.Usuario;

import java.util.List;
import java.util.Optional;

public class UsuarioRepository extends JpaRepository<Usuario>{

    public UsuarioRepository(EntityManager entityManager) {
        super(entityManager, Usuario.class);
    }

    public Optional<Usuario> findByUserEmail(String email) {
        var jpql = "SELECT a FROM Usuario a WHERE a.email LIKE :email";

        List<Usuario> usuarios = entityManager.createQuery(jpql, Usuario.class)
                .setParameter("email", "%" + email + "%")
                .getResultList();

        return usuarios.isEmpty() ? Optional.empty() : Optional.of(usuarios.get(0));
    }


}
