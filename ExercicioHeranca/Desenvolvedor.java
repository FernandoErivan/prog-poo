package ExercicioHeranca;

public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    Desenvolvedor(String nome, String cpf, int salario, String linguagemPrincipal){
        super(nome, cpf, salario);
        setLinguagemPrincipal(linguagemPrincipal);
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public String toString() {
        return"Nome : " + this.getNome() +
        "\ncpf: " + this.getCpf() +
        "\nSalário: " + this.getSalario() +
        "\nLinguagem que trabalha: " + this.getLinguagemPrincipal();
    }
}
