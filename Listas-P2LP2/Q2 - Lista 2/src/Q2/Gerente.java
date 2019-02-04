package Q2;

public class Gerente extends Empregado{
    private String departamento;

    public Gerente(String departamento, String nome, float salario) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public Gerente() {
    }
    
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente: " +  getNome()+ ", Departamento: " + departamento + ", Salario: "+ getSalario();
    }

   
    
    
}
