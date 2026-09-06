package AulaInicialPolimorfismo;
public class MainCachorro {

    public static void imprimeCachorro(Cachorro dog){
        System.out.println("Nome: " + dog.getNome());
        System.out.println("Raça: " + dog.getRaca());
        System.out.println("Latido: " + dog.latir());
        if (dog instanceof CachorroAdestrado) {
            System.out.println( ((CachorroAdestrado)dog).fingirdemorto());
        }
    }

    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro("Caramelo", "vira-lata");
        Cachorro dog2 = new Cachorro("Floquinho", "Peludo");
    
        imprimeCachorro(dog);
        System.out.println();
        imprimeCachorro(dog2);
    }
}
