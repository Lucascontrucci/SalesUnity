package org.example.Models;

import jakarta.persistence.*;
import lombok.*;
import org.example.Models.ValueObjects.Endereco;
import org.example.Models.ValueObjects.Telefone;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Cliente")
public class Cliente {

    @Id
    @Column(length = 50)
    private String email;

    private String nome_cliente;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Telefone telefone;

    private String historico;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Compra> compras;

}
