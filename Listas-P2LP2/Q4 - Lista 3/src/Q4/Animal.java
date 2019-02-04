package Q4;

public abstract class Animal {
    private String descricao;
    private String nome;

    public Animal(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome + " é um animal";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract void locomover();
    public abstract void alimentar();
    
    
}
