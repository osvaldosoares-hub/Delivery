package Compras;

import java.util.ArrayList;
//import java.util.Iterator;

import Adm.Cliente;
import Carrinho.Carrinho;
import Produtos.Coduser;
import Produtos.Produto;

public class Compras {
    private int codCompra;
    
    
    private Coduser codigo= new Coduser();
    static int qtdProduto;
    private int data;
    private boolean status;
    
    protected ArrayList<Produto> sacolasCompras= new ArrayList<>();
   

    public Compras(){
        
    }
    public int getCodCompra() {
        return codCompra;
    }
    public Coduser getCodigo() {
        return codigo;
    }
    
    public int getData() {
        return data;
    }
    public ArrayList<Produto> getListaCompras() {
        return sacolasCompras;
    }
    public static int getQtdProduto() {
        return qtdProduto;
    }
    public static void setQtdProduto(int qtdProduto) {
        Compras.qtdProduto = qtdProduto;
    }
    
    public void ListarCompras(Carrinho compra){
        
       this.sacolasCompras.addAll(compra.getCarrinho());
      
       Listar();
    }

    public int Listar(){
        
        System.out.println("-------------------");
        System.out.println("compras");
        System.out.println("cod usuario: " + 123);
        
        for(Produto p: sacolasCompras){
            
            System.out.println(p.getProduto() +" "+ p.getCodProduto());
          
           
          
        }
        System.out.println("-------------------");
       return 1;
    }
    
}
