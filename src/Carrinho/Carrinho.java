package Carrinho;

import java.util.ArrayList;
import java.util.Iterator;

import Compras.Compras;
import Produtos.Produto;

public class Carrinho {
   
    private int codUser;
    private Produto codProduto;
    static int qtd;
    static double subtotal=0;
    private ArrayList<Produto> carrinho;
    private Compras c ;



    
    public Carrinho(){
        this.carrinho = new ArrayList<Produto>();
    }
    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }
    public int addCarrinho(Produto produto){
        this.carrinho.add(produto);
        return 1;
    }

    public Compras getC() {
        return c;
    }

    public Produto getCodProduto() {
        return codProduto;
    }
    public int getCodUser() {
        return codUser;
    }
    public static int getQtd() {
        return qtd;
    }
    public double getSubtotal() {
        return subtotal;
    }
    
    public void setCodProduto(Produto codProduto) {
        this.codProduto = codProduto;
    }
    public void setCodUser(int codUser) {
        this.codUser = codUser;
    }
    public static void setQtd(int qtd) {
        Carrinho.qtd = qtd;
    }
    public void setSubtotal(double subtotal) {
        Carrinho.subtotal = subtotal;
    }
    public int RemoverDoCarrinho(String produto1 ,ArrayList<Produto> carrinho , Produto armazem){
            
            int i=0;
            for(Produto p : carrinho){
                if(p.getProduto().equals(produto1)==false){
                    System.out.println( i++);
                }else{
                    armazem.ListaDeProdutos(p);
                   
                }
            }
            for(Iterator<Produto> iterator = carrinho.iterator(); iterator.hasNext();){
                Produto value = iterator.next();
               if(value.getProduto().equals(produto1)){
                    
                    iterator.remove();
               } 
        }
           return 1;
           
    }
    public int finalizarCompra(Carrinho sacola){
         double saldo=0;
        
        for(Produto p : sacola.getCarrinho()){
           
            
           saldo = p.getPreço() + saldo;    
        }
        setSubtotal(saldo);
        this.c= new Compras();
        c.ListarCompras(sacola);

        sacola.carrinho.removeAll(sacola.getCarrinho());
        return 1;
       
    }


}
