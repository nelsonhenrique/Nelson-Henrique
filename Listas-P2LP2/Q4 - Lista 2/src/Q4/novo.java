package Q4;

public class novo extends imovel{
    private float adPreco;

    public novo(float adPreco, String enredeço, float preco) {
        super(enredeço, preco);
        this.adPreco = adPreco;
    }

    public novo() {
        super(null, 0);
    } 
    
    public void setAdPreco(float adPreco) {
        this.adPreco = adPreco;
    }
    
        public float calPreço(){
            return getPreco() + adPreco;
        
    }
    @Override
    public String toString() {
        return "Novo, " + "Preço: " + calPreço();
    }
}
