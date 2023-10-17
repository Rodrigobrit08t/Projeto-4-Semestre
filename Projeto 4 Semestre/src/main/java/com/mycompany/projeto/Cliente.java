package com.mycompany.projeto;


public class Cliente {
    int cpf;
    String nome;
    int MesaNum;

    public Cliente(int cpf, String nome, int MesaNum) {
        this.cpf = cpf;
        this.nome = nome;
        this.MesaNum = MesaNum;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getMesaNum() {
        return MesaNum;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMesaNum(int MesaNum) {
        this.MesaNum = MesaNum;
    }
    
    
}
    





