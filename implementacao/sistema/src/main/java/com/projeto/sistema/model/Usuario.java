package com.projeto.sistema.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
    
@Table(name="usuario")
@Entity(name="usuario")
public class Usuario {
    @Id
    private int id;

    @Column(length = 11)
    private String cpf;

    @Column(length = 45)
    private String nome;

    @Column(length = 45)
    private String sobrenome;
    
    private String email;
    private String senha;
    private String endereco;
    private String profissao;
    private Double rendimentos;


    public Usuario() {
    }

    public Usuario(int id, String cpf, String nome, String sobrenome, String email, String senha, String endereco, String profissao, Double rendimentos) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.profissao = profissao;
        this.rendimentos = rendimentos;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
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
            " id='" + getId() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", nome='" + getNome() + "'" +
            ", sobrenome='" + getSobrenome() + "'" +
            ", email='" + getEmail() + "'" +
            ", senha='" + getSenha() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", profissao='" + getProfissao() + "'" +
            ", rendimentos='" + getRendimentos() + "'" +
            "}";
    }
    





}

