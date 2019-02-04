package Q1;

public class Main {
    
    public static void main(String[] args) {
        
        Funcionario g = new Gerente("Nelson","123@email.com", "123", "123");
        
        g.RealizarLoginEmail("123@email.com", "123");
        g.RealizarLoginRegistro("123", "123");
        
        g.RealizarLoginEmail("000", "123");
        
        Funcionario a = new Atendente("Noslen", "321@gmail.com", "321", "321");
        
        a.RealizarLoginEmail("321@gmail.com", "321");
        a.RealizarLoginRegistro("321", "321");
        
        a.RealizarLoginEmail("000", "321");
        
    }
    
    
}
