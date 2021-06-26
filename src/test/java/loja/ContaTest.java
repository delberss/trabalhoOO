package loja;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void calcularValorTotalCompra() {
        Eletronico produto1 = new Eletronico();
        produto1.setNomePruduto("TV").setPrecoProduto(2000.f);

        Vestimenta produto2 = new Vestimenta();
        produto2.setNomePruduto("Jaqueta").setPrecoProduto(50.f);

        Calcado produto3 = new Calcado();
        produto3.setNomePruduto("Tênis").setPrecoProduto(100.f);
        List<Produto> listaDeProdutos = new ArrayList<Produto>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        assertEquals(2150.0f,Conta.calcularValorTotalCompra(listaDeProdutos));
    }


    @Test
    void calcularQuantidadeProdutosAcimaDe1000() {
        Eletronico produto1 = new Eletronico();
        produto1.setNomePruduto("TV").setPrecoProduto(2000.f);

        Vestimenta produto2 = new Vestimenta();
        produto2.setNomePruduto("Jaqueta").setPrecoProduto(50.f);

        Calcado produto3 = new Calcado();
        produto3.setNomePruduto("Tênis").setPrecoProduto(100.f);

        Eletronico produto4 = new Eletronico();
        produto4.setNomePruduto("PS5").setPrecoProduto(4500.f);

        Eletronico produto5 = new Eletronico();
        produto5.setNomePruduto("Computador").setPrecoProduto(5000.f);


        List<Produto> listaDeProdutos = new ArrayList<Produto>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produto5);

        assertEquals(3,Conta.calcularQuantidadeProdutosAcimaDe1000(listaDeProdutos));
    }
}