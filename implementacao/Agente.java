public class Agente extends Pessoa {
    
    public String matricula;

    public Agente(String rg, String cpf, String nome, String endereco) {
        super(rg, cpf, nome, endereco);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}
