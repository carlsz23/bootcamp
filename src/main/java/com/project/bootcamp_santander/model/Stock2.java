package com.project.bootcamp_santander.model;
/*MINHA ENTIDADE VAI SER O REFLEXO DA TABELA DO BANCO DE DADOS.
SE EU TENHO 10 TABELA NO BANCO, VOU TER 10 TAB AQUI TB.
* CLASSE JAVA RESPONSÁVEL POR EU FAZER UM INSERT, DELETE, UPDATE E SELECIONAR ALGO NA BASE*/

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_stock")
public class Stock2 {
    /*Estou linkando o id do codigo com o id do banco */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) /*Quando eu fiz um insert na base vai incrementar automaticamente*/
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "variation")
    private Double variation;

    @Column(name = "date")
    private LocalDate date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVariation() {
        return variation;
    }

    public void setVariation(Double variation) {
        this.variation = variation;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
