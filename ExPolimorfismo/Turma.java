package ExPolimorfismo;
import java.util.ArrayList;

public class Turma {
    private String nomeT;
    private ArrayList<Pessoa> participantes;

    public Turma(String nomeT){
        this.nomeT = nomeT;
        this.participantes = new ArrayList<>();
    }

    public String getNomeT() {
        return nomeT;
    }

    public void setNomeT(String nomeT) {
        this.nomeT = nomeT;
    }

    public void adicionarPessoas(Pessoa pessoa){
        participantes.add(pessoa);
    }

    public void analissarParticipantes(){

        for(int i = 0; i < participantes.size(); i++){
            Pessoa pessoa = participantes.get(i);
            
            if(pessoa instanceof Aluno aluninho){
                if(aluninho.foiAprovado()){
                    System.out.println();
                }
            }

            if (pessoa instanceof Aluno) {
                
                Aluno aluno = (Aluno) pessoa;
                if(aluno.foiAprovado()){
                    System.out.println(getNomeT() + " foi aprovado!");
                }
                else{
                    System.out.println(getNomeT() + " foi reprovado.");
                }
            }   else if (pessoa instanceof Professor) {
                
                Professor professor = (Professor) pessoa;
                professor.lecionar();
                
            }   else if (pessoa instanceof Coordenador) {
                
                Coordenador coordenador = (Coordenador) pessoa;
                coordenador.coordenar();
            }
        }
    }
}
