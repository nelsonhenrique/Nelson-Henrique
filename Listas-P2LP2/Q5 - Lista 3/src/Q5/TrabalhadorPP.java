package Q5;

public class TrabalhadorPP extends Empregado{
    private float remuneracao;
    private int quant;

    public TrabalhadorPP(float remuneracao, int quant, String nome, int cpf, int rg) {
        super(nome, cpf, rg);
        this.remuneracao = remuneracao;
        this.quant = quant;
    }


    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    public float calcularGanho() {
        return remuneracao * quant;
        
    }
    
}
