package Q3;

public class rec implements Fatorial{
    
    @Override
    public int calcular(int n){
        if (n == 1){
            return 1;
        }else{
            return calcular(n - 1) * n;
        }   
    }
}
