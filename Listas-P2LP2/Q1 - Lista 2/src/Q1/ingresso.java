package Q1;

public class ingresso {
    private float valor;

    public ingresso(float valor) {
        this.valor = valor;
    }

    public ingresso() {
    }
    

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ingresso: " + valor;
    }
       
    
}
