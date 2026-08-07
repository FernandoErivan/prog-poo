
public class Pessoa{
    int idade;
    String nome;
    String cpf;
    int km;

    void andar(){
        System.out.println("Andou");
    }

    void dormir(){
        System.out.println("Dormiu");
    }

    void aniversario(){
        idade = idade + 1;
    }

    void quilometros(int d){
        km = km + d;
       System.out.println("Andou"+ km +" Km");
    }
}
