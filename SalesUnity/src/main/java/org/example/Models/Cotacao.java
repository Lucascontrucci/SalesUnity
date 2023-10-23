package org.example.Models;

import jakarta.persistence.*;
import lombok.*;
import org.example.Models.Base.BaseEntity;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Cotacao")
public class Cotacao extends BaseEntity {

    private String status_cotacao;
    private Date data_cotacao;


    @OneToMany(mappedBy = "cotacao", fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Produto_Cotacao> produto_cotacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_fornecedor_ID")
    private Fornecedor fornecedor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_usuario_ID")
    private Usuario usuario;




}
