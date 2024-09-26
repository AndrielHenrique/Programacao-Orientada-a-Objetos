
package PacotePrincipal;


public class ClasseBasicona {


    public static void main(String[] args) {
       ClasseTeste classeTeste;
       classeTeste = new ClasseTeste("Joao"); //instancia
       
       //classeTeste = null; //perde o endereco de memoria
       
       //classeTeste.setNome("Joao");
       System.out.println(classeTeste.getNome());
       System.out.println(classeTeste.retornaNome());
       
       //System.out.println(classeTeste);
       System.out.println("");
       
       ClasseTeste ct01 = new ClasseTeste();
       ct01.setNome("Joaoquim");
       System.out.println(ct01.getNome());
       
       ClasseTeste ct02 = new ClasseTeste("Claudia");
       System.out.println(ct02.getNome());
    }
}
