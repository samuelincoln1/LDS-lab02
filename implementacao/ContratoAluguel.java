public class ContratoAluguel {

    public Cliente cliente;
    public Veiculo veiculo;
    public String tipoContrato;
    
    public ContratoAluguel(Cliente cliente, Veiculo veiculo, String tipoContrato) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.tipoContrato = tipoContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

}