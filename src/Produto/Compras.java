package Produto;

import java.util.ArrayList;
//import java.util.Iterator;

import Adm.Cliente;

public class Compras {
     private int codCompra;
    private Cliente user ;
    private int total;
    private Produto codProduto;
    private int qtdProduto;
    private int data;
    private int status;
    
    protected ArrayList<Produto> sacolasCompras= new ArrayList<>();
   

    public Compras(){
      
    }

    public ArrayList<Produto> getListaCompras() {
        return sacolasCompras;
    }
    
    public int sla(){
       System.out.println(getListaCompras().size() + "dsa");
       return 1;
    }

    public void ListarCompras(Carrinho compra){
        
       this.sacolasCompras.addAll(compra.getCarrinho());
      
       
    }

    public int Listar(){
        System.out.println("-------------------");
        System.out.println("compras");
       
        for(Produto p: sacolasCompras){
            
            System.out.println(p.getProduto());
          
           
          
        }
        System.out.println("-------------------");
       return 1;
    }
    
}
