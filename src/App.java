

import Adm.Cliente;
import Compras.Compras;
import Produtos.Coduser;
import Produtos.Produto;


public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente cleinte1= new Cliente();
        cleinte1.setNome("osvaldo");
        cleinte1.setEmail("valdim.osvaldo@gmail.com");
        cleinte1.setSenha("213");
        cleinte1.setCodigo(123);
        cleinte1.logar();


        
        Produto armazem = new Produto();
        Produto produto = new Produto("hamburguer",1, 23, 421, "BOM PRA CRL");
       
        Produto produto1 = new Produto("pizzacalabresa",5, 24, 427, "BOM PRA CRL");
        Produto produto2 = new Produto("pizza",6, 25, 428, "BOM PRA CRL");
        Produto produto3 = new Produto("pizza peperone",7, 27, 429, "BOM PRA CRL");
        Produto produto4 = new Produto("hamburguer com maionese",2, 24, 422, "BOM PRA CRL");
        
        armazem.ListaDeProdutos(produto);
        armazem.ListaDeProdutos(produto1);
        armazem.ListaDeProdutos(produto2);
        armazem.ListaDeProdutos(produto3);
        armazem.ListaDeProdutos(produto4);
        
        cleinte1.AddProdutoCarrinho(armazem,produto);
        
        
        
        //armazem.Categoria(estoque);
        
       cleinte1.AddProdutoCarrinho(armazem,produto1);
        
       
        //cleinte1.Carrinho();
        //cleinte1.BuscarProduto(estoque,"hamburguer");

        //cleinte1.BuscarPorCategoria(estoque,427);
       
       // armazem.Listar();
        
        
        //armazem.Categoria();

        

        System.out.println();
        System.out.println();
        
        //cleinte1.Carrinho(armazem);
        
        System.out.println();
        //armazem.Categoria();
        System.out.println();
        
        cleinte1.Carrinho(armazem);
        //cleinte1.Carrinho();

        System.out.println("compras");
        
        //cleinte1.Carrinho();
        
        //cleinte1.ListarCompras();
        System.out.println();
        
        Coduser cod =  new Coduser();
        cod.setUsercod(cleinte1.getCodigo());
        System.out.println(cod.getUsercod());

        
    }
}
