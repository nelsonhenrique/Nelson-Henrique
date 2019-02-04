package Q3;

public class ite implements Fatorial{
        @Override
        public int calcular(int n){
            int fat = 1;
            for( int i = 2; i <= n; i++ ){ 
                fat *= i;
            }
            
            return fat;
            }
        }

