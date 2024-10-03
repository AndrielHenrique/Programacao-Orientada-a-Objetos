package navegando;

public class No {
    No no;
    String mensagem="";
    
    public No(String msg){
        mensagem = msg;
    }
    
    public void setNo(No no){
        this.no = no;
    }
    
    public No getNo(){
        return no;
    }
    
    @Override
    public String toString(){
        return mensagem;
    }
}
