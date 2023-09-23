package com.projeto.sistema.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "contrato_aluguel")
@Entity(name = "contrato_aluguel")
public class ContratoAluguel {

    @Id @GeneratedValue
    public int id;
    @Column(name = "cliente_id")
    public int clienteId;
    @Column(name = "veiculo_id")
    public int veiculoId;
    public ContratoAluguel() {
        super();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getClienteId() {
        return clienteId;
    }
    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }
    public int getVeiculoId() {
        return veiculoId;
    }
    public void setVeiculoId(int veiculoId) {
        this.veiculoId = veiculoId;
    }
    
}
