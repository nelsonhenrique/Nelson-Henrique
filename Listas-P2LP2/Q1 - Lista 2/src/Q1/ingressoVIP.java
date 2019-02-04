package Q1;

public class ingressoVIP extends ingresso{
    private float valorAd;
    private float valorT;
    
    public ingressoVIP(float valor, float valorAd) {
        super(valor);
        this.valorAd = valorAd;
    }

    public ingressoVIP() {
    }
    
    public float getValorT(){
        return (this.valorAd + getValor());
        
    }

    public float getValorAd() {
        return valorAd;
    }

    public void setValorAd(float valorAd) {
        this.valorAd = valorAd;
    }

    @Override
    public String toString() {
        return "Valor VIP: " + getValorT();
    }
    
    
    
}
