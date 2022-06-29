package Produto;

import java.util.ArrayList;

public class Categoria {
    private Produto codigo;
    private String tipo;

    public void ListarCategoria(ArrayList<Produto> categoria){
        System.out.println("humburguer");
        for(Produto p : categoria){
            if(p.getCodCategoria() >= 421 && p.getCodCategoria() < 427 ){
               
                System.out.println(" "+p.getProduto()+ " " +p.getPreço()+ " "+ p.getDescricao());
                
            }
        }
        System.out.println("pizzas");
        for(Produto p: categoria){
           if(p.getCodCategoria() >=427 && p.getCodCategoria() < 432 ){
                
                System.out.println(" "+p.getProduto()+ " " +p.getPreço()+ " "+ p.getDescricao());
            }
        }
    }
    public Produto getCodigo() {
        return codigo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setCodigo(Produto codigo) {
        this.codigo = codigo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
