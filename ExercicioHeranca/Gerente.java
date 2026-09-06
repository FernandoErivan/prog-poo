package ExercicioHeranca;

public class Gerente extends Funcionario {
    private String departamento;

    Gerente(String departamento, String nome, String cpf, double salario){
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
        return "\nDepartamento: " + this.getDepartamento();
    }
}
