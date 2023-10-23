package Repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.Models.Usuario;
import org.example.Repositories.UsuarioRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsuarioRepositoryIntegrationTests {

    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    private static UsuarioRepository usuarioRepository;

    @BeforeAll
    public static void setUp(){
        entityManagerFactory = Persistence.createEntityManagerFactory("oracle");
        entityManager = entityManagerFactory.createEntityManager();
        usuarioRepository = new UsuarioRepository(entityManager);
    }

    @Test
    @Order(1)
    public void verifyLoad(){
        var usuario = usuarioRepository.getAll();
        assertFalse(usuario.size() < 1);
    }

    @Test
    @Order(2)
    public void saveArtist(){
        //Arrange
        var usuario = new Usuario("email1@gmail.co", "User 3", "sla123", "userType");

        usuarioRepository.create(usuario);

        var usuarioInserido = usuarioRepository.findByUserEmail(usuario.getEmail());
        assertNotNull(usuarioInserido);
        assertEquals(usuario.getNome_usuario(), usuarioInserido.get().getNome_usuario());
    }

}
