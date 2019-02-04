package Q4;

public class Aguia extends Ave{
    private String tipo;

    public Aguia(String tipo,String descricao, String nome) {
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
        System.out.println("Se alimenta como uma Aguia");
    }

    @Override
    public void locomover() {
        System.out.println("Voa");
    }
}
