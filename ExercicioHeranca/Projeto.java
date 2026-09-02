package ExercicioHeranca;

public class Projeto {
    private String nomeproj;
    private String descricao;
    private Desenvolvedor desenvolvedorresponsavel;

    Projeto(String nomeproj,String descricao, Desenvolvedor desenvolvedorresponsavel){
        setNomeproj(nomeproj);
        setDescricao(descricao);
        setdesenvolvedorresponsavel(desenvolvedorresponsavel);
    }

    public String getNomeproj() {
        return nomeproj;
    }

    public String getDescricao(){
        return descricao;
    }

    public Desenvolvedor getDesenvolvedorresponsavel() {
        return desenvolvedorresponsavel;
    }

    public void setNomeproj(String nomeproj) {
        this.nomeproj = nomeproj;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setdesenvolvedorresponsavel(Desenvolvedor desenvolvedorresponsavel){
        this.desenvolvedorresponsavel = desenvolvedorresponsavel;
    }

    @Override
    public String toString() {
        return "Projeto: " + this.getNomeproj() +
        "\nDescrição: " + this.getDescricao() +
        "\n====== Desenvolvedor =======\n" + desenvolvedorresponsavel;
    }

}
