package org.example.Models;

import jakarta.persistence.*;
import lombok.*;
import org.example.Models.Base.BaseEntity;
import org.example.Models.ValueObjects.Endereco;
import org.example.Models.ValueObjects.Telefone;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Transportadora")
public class Transportadora extends BaseEntity {

    private String nome_transportadora;

    private String email;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Telefone telefone;

    private String tipos_servico;

    @ManyToMany(mappedBy = "transportadoras",fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Fornecedor> fornecedores;


    @OneToMany(mappedBy = "transportadora", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Compra> compras;
}
