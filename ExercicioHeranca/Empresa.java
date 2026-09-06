package ExercicioHeranca;

import java.util.ArrayList;

public class Empresa {
    private Gerente gerente;
    private ArrayList<Projeto> projetos;

    public Empresa(Gerente gerente){
        this.gerente = gerente;
        this.projetos = new ArrayList<>();
    }
    
    public Empresa(Gerente gerente, ArrayList<Projeto> projetos){
        this.gerente = gerente;
        this.projetos = new ArrayList<>();
    }

    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public void AdicionarProjetos(Projeto projeto) {
        projetos.add(projeto);
    }
}
