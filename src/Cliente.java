public abstract class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public abstract Double aplicarDesconto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
