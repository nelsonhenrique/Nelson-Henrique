package Q4;

public class Macaco extends Mamifero{
    private String tipo;

    public Macaco(String tipo,String descricao, String nome) {
        super(descricao, nome);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void alimentar() {
        System.out.println("Se alimenta como um Macaco");
    }

    @Override
    public void locomover() {
        System.out.println("Se locomove como um Macaco");
    }
}
