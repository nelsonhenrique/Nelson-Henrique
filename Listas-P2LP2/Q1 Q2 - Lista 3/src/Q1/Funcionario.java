package Q1;

public abstract class Funcionario {
    private String email;
    private String registro;
    private String senha;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome,String email, String registro, String senha) {
        this.email = email;
        this.registro = registro;
        this.senha = senha;
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public abstract void RealizarLoginEmail(String email, String senha);
    
    public abstract void RealizarLoginRegistro(String registro, String senha);

    
}
