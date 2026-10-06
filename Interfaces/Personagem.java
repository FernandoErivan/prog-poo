package Interfaces;

public abstract class Personagem implements ICombatente{
    private String nome;
    private int level;
    private int vida;
    private static final int vidaMaxima = 100;

    public Personagem(String nome, int level, int vida){
        this.nome = nome;
        this.level = level;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public int getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void exibirStatus(){
        System.out.println("Nome: " + getNome() + "Nivel: " + level + "Vida: " + vida + "VidaMaxima: " + vidaMaxima);
    }

    public void curar(int quantidade){
     vida += quantidade;
     if(vida > vidaMaxima)
        vida = vidaMaxima;
    }

    public abstract void atacar(Personagem alvo);
    public abstract void usarHabilidade(Personagem alvo);
}
