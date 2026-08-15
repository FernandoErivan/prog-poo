public class Cliente {
    String nome;
    String rg;
    String cpf;
    Telefone telefone;
    Data datanasc;
    Endereco endereco;

    Cliente(String nome, String rg, String cpf, Telefone telefone, Data datanasc, Endereco endereco){
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
        this.datanasc = datanasc;
        this.endereco = endereco;
    }


}
