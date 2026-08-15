public class Aplicacao {
    public static void main(String[] args) {
        Telefone tel = new Telefone(81, "08");
        Data dataNasc = new Data(14, "Agosto", 2026);
        Endereco end = new Endereco("12988008", "541", "JB2", "Olinda", "PE");
        Cliente cli = new Cliente("fulano", "123456", "647873830", tel, dataNasc, end);

        System.out.println(cli.endereco.cidade);

    }
}
