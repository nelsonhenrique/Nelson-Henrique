package Q4;

public class Main {
    
    public static void main(String[] args) {
        Animal c =  new Cachorro("Vira lata", "Pequeno", "Dog");
        c.alimentar();
        c.locomover();
        System.out.println(c.getNome());
        
        Animal a =  new Passaro("Pombo", "Pequeno", "Pru Pru") {};
        a.alimentar();
        a.locomover();
        System.out.println(a.getNome());

    }
    
}
