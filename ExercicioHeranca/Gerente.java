package ExercicioHeranca;

public class Gerente extends Funcionario {
    private String departamento;

    Gerente(String departamento, String nome, String cpf, int salario){
        super(nome, cpf, salario);
        setDepartamento(departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Nome Gerente: "+ this.getNome() +
        "\ncpf: " + this.getCpf() +
        "\nSalário: " + this.getSalario() +
        "\nDepartamento: " + this.getDepartamento();
    }
}
