package Interfaces;

public class Arqueiro extends Personagem{
    private int agilidade;
    private int flechas;

    public Arqueiro(int agilidade, int flechas, String nome, int level, int vida){
        super(nome, level, vida);
        this.agilidade = agilidade;
        this.flechas = flechas;
    }

    @Override
    public void defender() {
        System.out.println("O Arqueiro se defendeu!");
    }

    @Override
    public void receberDano(int dano) {
        setVida(getVida() - dano);
        System.out.println(getNome() + " recebeu " + dano + " de dano!");
    }

    @Override
    public boolean estaVivo() {
        if(getVida() <= 0)
            return false;
        return true;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0) {
            flechas --;
            
            System.out.println(getNome() + " lançou as flechas!");
            alvo.receberDano(agilidade);
        }else{
            System.out.println("Flechas insuficientes!");
        }

    }

    @Override
    public void usarHabilidade(Personagem alvo) {
       System.out.println("Chuva de flechas de fogo!!");
    }
    
}
