package navegando;

public class Nav {
    No no;
    
    public void setNo(No no){
        this.no = no;
    }
    
    public No next(){
        if(no.no!=null){
             no=no.no;
        }
        return no;
    }
    
    public void mostrarNo(){
        System.out.println(no);
    }
}
