package AulaHeranca;

public class AplicacaoHeranaca{
    public static void main(String[] args) {
        
        Cliente cli = new Cliente("Fulano", "Rua do Príncipe");
        ClientePF cliPF = new ClientePF("Ciclano","Rua da Moeda", "161.839.878.15");
        ClientePJ cliPJ = new ClientePJ("Google", "Vale do cilicio", "73.737.388/0004-45");

        System.out.println(cli);
        System.out.println(cliPF);
        System.out.println(cliPJ);
    }
}