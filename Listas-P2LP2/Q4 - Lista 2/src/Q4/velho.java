package Q4;

public class velho extends imovel{
    private float desPreco;

    public velho(float desPreco, String enredeço, float preco) {
        super(enredeço, preco);
        this.desPreco = desPreco;
    }

    public velho() {
        super(null, 0);
    }
   
    public void setDesPreco(float desPreco) {
        this.desPreco = desPreco;
        
    }
    
    public float calPreço(){
        return getPreco() - desPreco;
        
    }

    @Override
    public String toString() {
        return "Velho, " + "Preço: " + calPreço();
    }
    
    
}
