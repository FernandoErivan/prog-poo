package ExercicioHeranca;

import java.util.ArrayList;

public class Empresa {
    Gerente gerente;
    private ArrayList<Projeto> projetos;

    public Empresa(){
        projetos = new ArrayList<>();
    }

    public void AdicionarProjetos(Projeto projeto) {
        projetos.add(projeto);
    }
}
