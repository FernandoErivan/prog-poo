package ExercicioHeranca;

public class Funcionario {
    private String nome;
    private String cpf;
    int salario;

    Funcionario(String nome, String cpf, int salario){
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
        "\nCPF: " + this.getCpf() +
        "\nSALÁRIO: " + this.getCpf();
    }
}
