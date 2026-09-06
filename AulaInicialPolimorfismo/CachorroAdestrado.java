package AulaInicialPolimorfismo;

public class CachorroAdestrado extends Cachorro{
    
    public CachorroAdestrado(String nome, String raca){
        super(nome, raca);
    }

    public String deitar(){
        return "Deitei!";
    }

    public String virar(){
        return "Virei!";
    }

    public String fingirdemorto(){
        return "Morri!";
    }
}
