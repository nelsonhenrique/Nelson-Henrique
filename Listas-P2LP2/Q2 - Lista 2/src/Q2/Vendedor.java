package Q2;

public class Vendedor extends Empregado{
    private float comissao;

    public Vendedor(float comissao, String nome, float salario) {
        super(nome, salario);
        this.comissao = comissao;
    }

    public Vendedor() {
    }
    
    
    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    public float calcularSal(float salario){
        return (float) (salario + (salario * (this.comissao * 0.01)));
    }
    
    
    @Override
    public String toString() {
        return "Vendedor: "+ getNome() + ", Salario sem comissao: "+ getSalario() + ", Salario com comissao: " + calcularSal(getSalario());
    }

    
    
}
