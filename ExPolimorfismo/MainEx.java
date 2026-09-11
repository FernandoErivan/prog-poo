package ExPolimorfismo;

public class MainEx {
    public static void main(String[] args) {
        
        Turma turma = new Turma("3ºP SIN");

        Aluno aluno1 = new Aluno("Pablo", 18, 9.75);
        Aluno aluno2 = new Aluno("Raul", 20, 6.55);
        Aluno aluno3 = new Aluno("Amanda", 19, 9.90);

        Professor professor1 = new Professor("Matheus", 42, "Programação");
        Professor professor2 = new Professor("Andrade", 32, "CiberSegurança");

        Coordenador coordenador = new Coordenador("Frank", 65, "Tecnólogia da Informação");

        turma.adicionarPessoas(aluno1);
        turma.adicionarPessoas(aluno2);
        turma.adicionarPessoas(aluno3);
        
        turma.adicionarPessoas(professor1);
        turma.adicionarPessoas(professor2);
        
        turma.adicionarPessoas(coordenador);

        turma.analissarParticipantes();
    }
}
