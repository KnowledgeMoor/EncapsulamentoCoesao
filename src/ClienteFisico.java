public class ClienteFisico extends Cliente {

    public ClienteFisico(String nome) {
        super(nome);
    }

    @Override
    public Double aplicarDesconto(){
        return 0.1;
    }
}
