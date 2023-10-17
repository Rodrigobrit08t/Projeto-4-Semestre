
package com.mycompany.projeto;


public class Produtos {
   int codigo;
   String nome;
   String descricao;
   Float preco;
   String categoria;

    public Produtos(int codigo, String nome, String descricao, Float preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
   
   
}
