package Q5;

public class TrabalhaCom extends Empregado{
    private int quantidade;
    private float comissao;
    private float salario;


    public TrabalhaCom(int quantidade, float comissao, String nome, int cpf, int rg) {
        super(nome, cpf, rg);
        this.quantidade = quantidade;
        this.comissao = comissao;
    }

    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    @Override
    public float calcularGanho() {
        return salario + (comissao * quantidade);
        
    }
    
}
