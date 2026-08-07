public class Main {
        public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.idade = 19;
        p.nome = "Javinha";
        p.cpf = "123.456.789-10";

        System.out.println(p.nome + " de cpf: "+ p.cpf +" tem idade: " + p.idade);

        Pessoa p2 = new Pessoa();
        p2.idade = 45;
        p2.nome = "White";
        p2.cpf = "534.986.098-15";

        System.out.print(p2.nome + " de cpf: " + p2.cpf+ " tem idade: " + p2.idade);
        p.quilometros(2);
        p.quilometros(2);
        p.quilometros(2);
        //p.aniversario();

        //System.out.println(p.nome + " de cpf:"+ p.cpf +" tem idade:" + p.idade);

    }
}
