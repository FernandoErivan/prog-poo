package Interfaces;

public interface ICombatente {
    public void atacar(Personagem alvo);
    public void defender();
    public void usarHabilidade(Personagem alvo);
    public void receberDano(int dano);
    public boolean estaVivo();

}
