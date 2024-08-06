public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public Double aplicarImposto(){
        return 0.1;
    }

    public double aplicarTaxaAdicional(){
        return 50;
    }

    public Double calcularPrecoFinal(Cliente cliente){
        double desconto = cliente.aplicarDesconto();
        double imposto = aplicarImposto(); // 10% de imposto fixo para todos os produtos
        double taxaAdicional = aplicarTaxaAdicional(); // Taxa adicional fixa de 50 para todos os produtos

        double precoComDesconto = this.precoBase * (1 - desconto);
        double precoFinal = precoComDesconto + (precoComDesconto * imposto) + taxaAdicional;
        
        if (precoFinal < 0) {
            precoFinal = 0;
        }

        return precoFinal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPrecoBase() {
        return precoBase;
    }
    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
