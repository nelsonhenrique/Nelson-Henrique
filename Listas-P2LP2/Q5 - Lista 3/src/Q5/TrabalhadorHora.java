package Q5;

public class TrabalhadorHora extends Empregado{
    private float salaroHora;
    private int horas;

    public TrabalhadorHora(float salaroHora, int horas, String nome, int cpf, int rg) {
        super(nome, cpf, rg);
        this.salaroHora = salaroHora;
        this.horas = horas;
    }

    public TrabalhadorHora() {
        super(null, 0, 0);
    }
    
    
    public float getSalaroHora() {
        return salaroHora;
    }

    public void setSalaroHora(float salaroHora) {
        this.salaroHora = salaroHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public float calcularGanho() {
        return salaroHora * horas;
    }
    
    
    
}
