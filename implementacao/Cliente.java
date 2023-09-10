import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String profissao;
    public List<EntidadeEmpregadora> entidadesEmpregadoras;
    public double[] rendimentos;

    public Cliente(String rg, String cpf, String nome, String endereco, String profissao) {
        super(rg,cpf,nome,endereco);
        this.entidadesEmpregadoras = new ArrayList<EntidadeEmpregadora>();
        this.rendimentos = new double[3];
    }
    
    public void adicionarEntidadeEmpregadora(EntidadeEmpregadora entidade) {
        entidadesEmpregadoras.add(entidade);
    }
    
    public List<EntidadeEmpregadora> getEntidadesEmpregadoras() {
        return entidadesEmpregadoras;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setEntidadesEmpregadoras(List<EntidadeEmpregadora> entidadesEmpregadoras) {
        this.entidadesEmpregadoras = entidadesEmpregadoras;
    }

    public double[] getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double[] rendimentos) {
        this.rendimentos = rendimentos;
    }
}