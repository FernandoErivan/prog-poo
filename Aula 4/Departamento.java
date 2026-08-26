public class Departamento{
    private int codigo;
    private String name;
    
    public Departamento(int codigo, String name){
       setCodigo(codigo);
       setName(name);
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        if(codigo >= 0){
            this.codigo = codigo;
        }
        else{
            System.out.println("Valor inválido");
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name.length() >= 1){
            this.name = name;
        }
        else{
            System.out.println("Preencha com seu nome");
        }
    }

    @Override
    public String toString() {
        return getName() + "\nCódigo do departamento: " + getCodigo();
    }
}
