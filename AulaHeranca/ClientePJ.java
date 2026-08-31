package AulaHeranca;

public class ClientePJ extends Cliente{
    private String cnpj;

    public ClientePJ(String nome, String endereco, String cnpj){
        super(nome, endereco);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.getNome() +
        "\nEndereço: " + this.getEndereco() +
        "\nCNPJ: " + this.getCnpj() + "\n";
    }
}
