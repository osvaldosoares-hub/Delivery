package Adm;



import Produto.Compras;

import User.Usuario;

public class Cliente extends Usuario{
    private Compras comprarealizada;
    
    public Cliente(){
       this.comprarealizada = new Compras();
    }
    public int ListarCompras(){
        comprarealizada.Listar();
        return 1;
    }
   
   
}
