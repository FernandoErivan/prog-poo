package Interfaces;
public class Guerreiro extends Personagem{
    private int forca;
    private int defesa;

    public Guerreiro(String nome, int level, int vida, int forca, int defesa){
        super(nome, level, vida);
        this.forca = forca;
        this.defesa = defesa;
    }
    @Override 
    public void receberDano(int dano){
        setVida(getVida() - dano);
        System.out.println(getNome() + " recebeu" + dano + " de dano!");
    }

    @Override
    public void defender() {
        System.out.println("O Guerreiro se defendeu!");
    }

    @Override
    public boolean estaVivo() {
       if (getVida() <= 0) 
            return false;
        return true;
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " atacou com a sua espada!");
        alvo.receberDano(forca);
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        System.out.println("Golpe forte!");
    }

    
}
