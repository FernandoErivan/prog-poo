public class Funcionario {
    private int matricula;
    private String nome;
    Departamento depto;

    Funcionario(int matricula, String nome, Departamento depto){
        this.matricula = matricula;
        this.nome = nome;
        this.depto = depto;
    }
    
    public Departamento getDepart(){
        return depto;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public String getNome(){
        return nome;
    }

    public void setDepart(Departamento depto){
        if (depto == null) {
            throw new IllegalArgumentException("o departamento não ser nulo!");
        }
        this.depto = depto;
    }

    public void setMatricula(int matricula){
        if (matricula < 0) {
            throw new IllegalArgumentException("A matricula não pode ser menor que zero!");
        }
        this.matricula = matricula;
    }

    public void setNome(String nome){
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio!");
        }
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "Nome do Funcionario: " + this.nome + 
                "\nMatrícula: " + this.matricula +
                "\nDepartamento: " + this.depto;
    }
}