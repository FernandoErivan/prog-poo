public class ApllicacaoFuncionario {
    public static void main(String[] args) {
        Departamento departamento = new Departamento(777, "Emplydev");
        Funcionario funcionario = new Funcionario(62728282, "Fulano", departamento);

        System.out.println(funcionario);
    }
}
