package PacotePrincipal;

public class ClasseTeste {
    private String nomeDaPessoa;
    
    public ClasseTeste(){
        nomeDaPessoa ="";
        
    }
    
    public ClasseTeste(String nome){
        this.nomeDaPessoa = nome;
    }
    
    public void setNome(String nome){
        if(nome.equals("")){
            return;
        }
        this.nomeDaPessoa = nome;
    }
    
    public String getNome(){
        return nomeDaPessoa;
    }
    
    String retornaNome(){
        return nomeDaPessoa;
    }
}
