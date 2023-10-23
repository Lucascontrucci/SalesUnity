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
@Table(name="Fornecedor")
public class Fornecedor extends BaseEntity {

    private String nome_empresa;

    @Embedded
    private Endereco endereco;

    @Embedded
    private Telefone telefone;

    private String categoria_prd_fornecidos;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "fornecedor_produto",
            joinColumns = @JoinColumn(name = "FK_fornecedor_id"),
            inverseJoinColumns = @JoinColumn(name="FK_produto_id")
    )
    private List<Produto> produtos;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "fornecedor_transportadora",
            joinColumns = @JoinColumn(name = "FK_fornecedor_id"),
            inverseJoinColumns = @JoinColumn(name="FK_transportadora_id")
    )
    private List<Transportadora> transportadoras;


    @OneToMany(mappedBy = "fornecedor", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Cotacao> cotacoes;


}
