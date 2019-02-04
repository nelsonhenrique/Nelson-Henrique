package Q5;

public class Chefe extends Empregado{
    private float salarioMensal;
    
    public Chefe(float salaroMensal,String nome, int cpf, int rg) {
        super(nome, cpf, rg);
        this.salarioMensal = salarioMensal;
    }

    public Chefe() {
        super(null, 0, 0);
    }
    
    
    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
 
    @Override
    public float calcularGanho() {
        return salarioMensal;
    }
    
}
