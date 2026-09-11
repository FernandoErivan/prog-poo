package ExPolimorfismo;

public class Professor extends Pessoa{
    private String diciplina;

    Professor(String nome, int idade, String diciplina){
        super(nome, idade);
        this.diciplina = diciplina;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina){
        this.diciplina = diciplina;
    }

    public void lecionar(){
        System.out.println(getNome() + " está lecionando" + " " + diciplina + " ");
    }

    // @Override
    // public String toString() {
    //     return "\nDiciplina que leciona: "+ diciplina;
    // }
}
