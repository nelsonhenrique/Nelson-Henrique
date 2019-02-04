package Q4;

public abstract class Mamifero extends Animal{
    
    public Mamifero(String descricao, String nome) {
        super(descricao, nome);
    }
    
    @Override
    public abstract void alimentar();
    
    @Override
    public abstract void locomover();
}
