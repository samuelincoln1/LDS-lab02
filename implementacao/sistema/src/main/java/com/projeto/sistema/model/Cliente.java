package com.projeto.sistema.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="cliente")
@Entity(name="cliente")
public class Cliente extends Usuario{
    

    @Column(length = 11)
    private String cpf;

    private String profissao;
    private Double rendimentos;


    public Cliente() {
    }

    public Cliente(String cpf, String profissao, Double rendimentos) {
        this.cpf = cpf;
        this.profissao = profissao;
        this.rendimentos = rendimentos;
    }

    

    public String getcpf() {
        return this.cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getprofissao() {
        return this.profissao;
    }

    public void setprofissao(String profissao) {
        this.profissao = profissao;
    }

    public Double getRendimentos() {
        return this.rendimentos;
    }

    public void setRendimentos(Double rendimentos) {
        this.rendimentos = rendimentos;
    }

    @Override
    public String toString() {
        return "{" +
            ", cpf='" + getcpf() + "'" +
            ", profissao='" + getprofissao() + "'" +
            ", rendimentos='" + getRendimentos() + "'" +
            "}";
    }
}