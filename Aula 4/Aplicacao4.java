public class Aplicacao4 {
    public static void main(String[] args) {
        
        Departamento d = new Departamento(100, "Teste");
        System.out.println(d.getName());
        d.setCodigo(-1);
        System.out.println(d.getCodigo());

    }    
}
