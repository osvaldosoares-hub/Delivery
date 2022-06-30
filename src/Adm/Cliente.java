package Adm;



import Produtos.Coduser;
import User.Usuario;

public class Cliente extends Usuario{
    private Coduser cod= new Coduser();  
    public Cliente(){
      
    }
    public Coduser getCod() {
        return cod;
    }
    public int ListarCompras(){
        System.out.println(getCodigo());
        
        return 1;
    }


    public int pegarCodUser(){
        
        return 1;
   }
   
   
}
