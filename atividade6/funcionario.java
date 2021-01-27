public class Funcionario extends Pessoa{
    
    int matricula;
    int salario;

    
    public Funcionario(){}
    
    public Funcionario(int mat, int sal, String nom, String sobreNom ){
        
        super.nome = nom;
        super.sobrenome = sobreNom;
        this.matricula = mat;
        this.salario = sal;
    }



    public void setNome(String nom){
        super.nome = nom;
    }
    public void setSobrenome(String sobreNom){
        super.sobrenome = sobreNom;
    }
    
    public void setMatricula(int mat){
        matricula = mat;
    }
    
    public void setSalario(int sal){
        salario = sal;
    }
    
    public int getMatricula(){
        return matricula;
    }
    
    public int getSalario(){
        return salario;
    }
}