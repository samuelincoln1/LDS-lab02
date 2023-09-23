package com.projeto.sistema.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="veiculo")
@Entity(name="veiculo")
public class Veiculo {
    
    @Id
    private int id;
    private int ano;
    private String matricula;
    private String modelo;
    private String placa;
    @Column(name = "valor_aluguel")
    private float valorAluguel;


    public Veiculo() {
    }

    public Veiculo(int ano, String matricula, String modelo, String placa, float valorAluguel) {
        this.ano = ano;
        this.matricula = matricula;
        this.modelo = modelo;
        this.placa = placa;
        this.valorAluguel = valorAluguel;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
