package Q3;

public class Conta {
    private int numConta;
    private float saldo;

    public Conta(int numConta, float saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }
    
    private boolean validarSaque(float n){
        
        if (n >= saldo) {
            return true;
        
        }else{
            return false;
        }
        
    }
    
    private boolean validarConta(int c){
        if(c == numConta){
            return true;
    
        }else{
            return false;
        
        }
        
    }
    
}
