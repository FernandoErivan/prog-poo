package ExercicioHeranca;
public class MainHeranca {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Desenvolvedor dev = new Desenvolvedor("Galego", "272.545.535-15", 16990, "SQL");
        Desenvolvedor dev2 = new Desenvolvedor("Tranquilão", "783.948.433-00", 29990, "Java");

        Projeto projeto1 = new Projeto("Aula web", "Desenvolvimento web", dev);
        Projeto projeto2 = new Projeto("Aula POO", "Desenvolvimento em Java", dev2);

        empresa.AdicionarProjetos(projeto1);
        empresa.AdicionarProjetos(projeto2);
        
        System.out.println(projeto1);
        System.out.println();
        System.out.println(projeto2);
    }
}
