package Produtos;

import java.util.ArrayList;

import Produto.Categoria;

public  class Produto {
    private int codProduto;
    private int codCategoria;
    private String descricao;
    private String produto;
    private double preço;
    static int estoque=0;
    protected ArrayList<Produto> itens;
    private Categoria categoria;
    public Produto(String produto, int codProduto, double preço, int codCategoria,String descricao){
        this.produto = produto;
        this.codProduto = codProduto;
        this.preço=preço;
        this.codCategoria =codCategoria;
        this.descricao = descricao;
        estoque++;
        this.categoria = new Categoria();
        this.itens=new ArrayList<Produto>();
    }
    
    public static void setEstoque(int estoque) {
        Produto.estoque = estoque;
    }
    public Produto(){
        this.categoria = new Categoria();
        this.itens=new ArrayList<Produto>();
    }
    public ArrayList<Produto> getItens() {
        return itens;
    }
    public void tamanho(){
        int i;
        
        for(i=0; i<= itens.size();i++){
         
        }
        System.out.println(i);
    }
    public void removendoEstoque(Produto produto){
       this.itens.remove(produto);
        estoque--;
    }
    public String getProduto() {
        return produto;
    }
    public int getCodCategoria() {
        return codCategoria;
    }
    public int getCodProduto() {
        return codProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getEstoque() {
        return estoque;
    }
    public double getPreço() {
        return preço;
    }
    public void ListaDeProdutos(Produto item){
        this.itens.add(item);
    
    }
    
    public int Listar(){
        int i=0;
        System.out.println("-------------------");
        
        for(Produto p : itens){
            System.out.println(p.getProduto());
            System.out.println();
            i++;
         }
         System.out.println("-------------------");
         setEstoque(i);
         return 1;
    }
    public Categoria getCategoria() {
        return categoria;
    }
   
    public int Categoria(){
        categoria.ListarCategoria(itens);
        return 1;
        
    }
    
}
