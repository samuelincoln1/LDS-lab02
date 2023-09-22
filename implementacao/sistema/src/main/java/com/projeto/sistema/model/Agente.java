package com.projeto.sistema.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Table(name="agente")
@Entity(name="agente")
public class Agente extends Usuario {

    @Column(length = 14)
    private String cnpj;



    public Agente() {
    }

    public Agente(String cnpj) {
        this.cnpj = cnpj;
    }

    

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
    @Override
    public String toString() {
        return "{" +
            ", cnpj='" + getCnpj() + "'" +
            "}";
    }
}
