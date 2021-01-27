public class Pessoa {
	 
		  
	    private String nome;   
	    private String sobrenome;   

	    // construtor default   
	    public Pessoa() {   
	        super();   
	     }   

	              // construtor com nome e sobrenome   
	    public Pessoa(String nome, String sobrenome) {   
	        setNome(nome);   
	        setNome(sobrenome);   
	    }   
	       
	  
	    private void setNome(String nome2) {
					// TODO Auto-generated method stub
					
				}
 // define ou altera o nome da pessoa   
    public void setNome(String temp) {   
        this.nome = temp;   
    }   
  
    // retorna sobrenome   
    public String getSobrenome() {   
        return sobrenome;   
    }   
  
    // define ou altera o nome da pessoa   
    public void setSobrenome(String temp) {   
        this.sobrenome = temp;   
    }   
    
    //retorna nome completo   
    public String getNomeCompleto(){   
        return this.nome + " " + this.sobrenome;   
    }   
}