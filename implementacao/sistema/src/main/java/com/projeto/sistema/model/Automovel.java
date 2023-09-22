package com.projeto.sistema.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="automovel")
@Entity(name="automovel")
public class Automovel {
    
    @Id
    private int id;
    private String ano;
    private int matricula;
    private String modelo;
    private String placa;


    public Automovel() {
    }

    public Automovel(String ano, int matricula, String modelo, String placa) {
        this.ano = ano;
        this.ano = ano;
        this.modelo = modelo;
        this.placa = placa;
    }

    

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "{" +
            ", ano='" + getAno() + "'" +
            ", matricula='" + getMatricula() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", placa='" + getPlaca() + "'" +
            "}";
    }
}
