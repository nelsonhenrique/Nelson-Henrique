package Q4;

public abstract class Ave extends Animal{
    
    public Ave(String descricao, String nome) {
        super(descricao, nome);
    }
    
    @Override
    public abstract void alimentar();
    
    @Override
    public abstract void locomover();
    
}
