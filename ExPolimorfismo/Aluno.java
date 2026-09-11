package ExPolimorfismo;

public class Aluno extends Pessoa{
    private double media;
    
    Aluno(String nome, int idade, double media){
        super(nome, idade);
        this.media = media;
    }

    public double getMedia() {
        return media;
    }
    
    public void setMedia(double media) {
        this.media = media;
    }
    
    public boolean foiAprovado(){
        return this.media >= 7.0;
    }

    // @Override
    // public String toString() {
    //     return "\nMedia: "+ this.media;
    // }
}
