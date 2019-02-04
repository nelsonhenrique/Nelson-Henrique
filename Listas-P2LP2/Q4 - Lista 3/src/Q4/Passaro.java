package Q4;

public class Passaro extends Ave{
    private String tipo;

    public Passaro(String tipo,String descricao, String nome) {
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
        System.out.println("Se alimenta como um Passaro");
    }

    @Override
    public void locomover() {
        System.out.println("Voa");
    }
}
