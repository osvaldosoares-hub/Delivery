package User;

import java.util.ArrayList;
import java.util.Scanner;

import Produto.Carrinho;
import Produto.Produto;

public abstract class Usuario {
    
    private String nome;
    private String senha;
    private String email;
    private String endereço;
    private String cidade;
    private String cep;
    private String cpf;
    private int codigo;
    private int rg;
    private int telefone;
    private int ip;
    private boolean logado;
    private Produto produtos;
    private Carrinho sacola;
    
    
    
    public Usuario(){
        this.nome="";
        this.senha="";
        this.email="";
        this.endereço="";
        this.cidade="";
        this.cep="";
        this.cpf="";
        this.codigo=0;
        this.rg=0;
        this.telefone=0;
        this.ip=0;
        this.logado=false;
        this.produtos= new Produto();
        this.sacola = new Carrinho();
        
    }
    
    
    public Carrinho getSacola() {
        return sacola;
    }
    public void setSacola(Carrinho sacola) {
        this.sacola = sacola;
    }
    public Produto getProduto() {
    return produtos;
    }
   public String getCep() {
       return cep;
   }
   public String getCidade() {
       return cidade;
   }
   public int getCodigo() {
       return codigo;
   }
   public String getCpf() {
       return cpf;
   }
   public String getEmail() {
       return email;
   }
   public String getEndereço() {
       return endereço;
   }
   public int getIp() {
       return ip;
   }
   public String getNome() {
       return nome;
   }
   public int getRg() {
       return rg;
   }
   public String getSenha() {
       return senha;
   }
   public int getTelefone() {
       return telefone;
   }
   public void setCep(String cep) {
       this.cep = cep;
   }
   public void setCidade(String cidade) {
       this.cidade = cidade;
   }
   public void setCodigo(int codigo) {
       this.codigo = codigo;
   }
   public void setCpf(String cpf) {
       this.cpf = cpf;
   }
   public void setEmail(String email) {
       this.email = email;
   }
   public void setEndereço(String endereço) {
       this.endereço = endereço;
   }
   public void setIp(int ip) {
       this.ip = ip;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public void setRg(int rg) {
       this.rg = rg;
   }
   public void setSenha(String senha) {
       this.senha = senha;
   }
   public void setTelefone(int telefone) {
       this.telefone = telefone;
   }
   public void setProduto(Produto produto) {
       this.produtos = produto;
   }

   public boolean logar(){
        if(this.email == null && this.senha == null){
            return this.logado = false;
        }
        return this.logado = true;
   }
    public int AddProdutoCarrinho(Produto armazem , Produto produto){
       if(logado==true){
        if(produto.getEstoque()==0){
            
            System.out.println("nao temos mais: " + produtos.getProduto());
            return 0;
        }else{
        sacola.addCarrinho(produto);
        armazem.removendoEstoque(produto);
        return 1;
    } 
    }else{
        System.out.println("pfv faça o seu login");
        return 0;
    }
    
    }
    public int Carrinho(){
        if(logado==true){
        for(Produto p: sacola.getCarrinho()){
            System.out.println(p.getProduto());

        }
        return 1;
    }else{
        System.out.println("pfv faça o seu login");
        return 0;
    }
        
    }
    public int Carrinho(Produto armazem){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int opçao=0;
        String item;
        if(logado==true){
            if(sacola.getCarrinho().size() == 0){
            System.out.println("carrinho vazio");
            sc1.close();
            sc2.close();
            return 0;
        }else{
            //double saldo=0;
            System.out.println("-------------------");
            for(Produto p : sacola.getCarrinho()){
                System.out.println(p.getProduto()+" " +p.getPreço()+ " "+ p.getDescricao());
                System.out.println();
                
            } /*perguntar ao usuario  se ele quer tirar algo do carrinho*/
            System.out.println();
            System.out.println("-------------------");
            System.out.println("1- Quer tirar algo do carrinho?");
            System.out.println("2- Ou finalizar a compra");
            opçao = sc1.nextInt();
            if(opçao == 1){
                System.out.println("qual item voce quer remover");
                for(Produto p : sacola.getCarrinho()){
                    System.out.println(p.getProduto()+" " +p.getPreço()+ " "+ p.getDescricao());
                    System.out.println();
                } 
                System.out.println("-------------------");
                System.out.println("por favor coloque o nome do item que voce quer remover corretamente");
                item= sc2.nextLine();
                sacola.RemoverDoCarrinho(item,sacola.getCarrinho(), armazem);
                sc1.close();
                sc2.close();
                
            }else if(opçao == 2){
            System.out.println("quantidade no carrinho" + sacola.getCarrinho().size());
            sacola.finalizarCompra(sacola);
            sc1.close();
            sc2.close();
            return 1;
        }else {
            System.out.println("digite o numero certo seu acefalo");
            sc1.close();
            sc2.close();
            return 0;

            
        }
        sc1.close();
        return 1;
        
        }
        }else{
            System.out.println("pfv faça o seu login");
            sc1.close();
            sc2.close();
            return 0;

        }
   
    }
    public void BuscarProduto(ArrayList<Produto> armazem,String produto){
        if(logado==true){
        int tru=0;
        for(Produto p : armazem){
            if(p.getProduto().equals(produto)){
                System.out.println("seu produto = "+p.getProduto()+" " +p.getPreço()+ " "+ p.getDescricao());
                tru++;
            }
        }
        if(tru==0){
            System.out.println("seu produto não existe, digite o nome do produto certo");
        }else{
            System.out.println();
        }
    }else{
        System.out.println("pfv faça o seu login");
    }
    }
    public void BuscarPorCategoria(ArrayList<Produto> armazem,int produto){
        if(logado==true){
        int tru=0;
        for(Produto p : armazem){
            if(p.getCodCategoria() == produto){
            System.out.println("seu produto = "+p.getProduto()+" " +p.getPreço()+ " "+ p.getDescricao());
            tru++;
            }
        }
        if(tru==0){
        System.out.println("seu produto não existe, digite o cod Categoria certo");
    }else{
        System.out.println();
    }
    }else{
    System.out.println("pfv faça o seu login");
    }
    }
    public void AlterarDados(){
        System.out.println("qual dado vc quer alterar");
        System.out.println("1- nome: ");
        System.out.println("2- senha:");
        System.out.println("3- endereço: ");
        System.out.println("4- cep: ");
        System.out.println("5- telefone: ");
        System.out.println("6- cidade: ");
        //int dados;

        /*if(dados ==1){

        }*/

    }



}
