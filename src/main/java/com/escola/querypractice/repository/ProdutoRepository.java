package com.escola.querypractice.repository;

import com.escola.querypractice.model.Cliente;
import com.escola.querypractice.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * =====================================================================
 *  AQUI E ONDE VOCE TRABALHA!  (Produtos)
 * =====================================================================
 *
 * Adicione os metodos dos exercicios abaixo, usando o nome e a
 * assinatura EXATOS indicados. O nome precisa bater certinho, senao
 * o verificador nao encontra o seu metodo.
 *
 * Depois de escrever, rode a aplicacao e abra http://localhost:8080
 * para ver se o exercicio ficou VERDE (passou) ou VERMELHO (falhou).
 *
 * Imports que voce provavelmente vai precisar:
 *   import java.util.List;
 *   import java.math.BigDecimal;
 *   import org.springframework.data.jpa.repository.Query;
 *   import org.springframework.data.repository.query.Param;
 *
 * ---------------------------------------------------------------------
 *  EXERCICIOS QUE USAM ESTE REPOSITORIO
 * ---------------------------------------------------------------------
 *  FACIL
 *   E1
 *   E2
 *   E3
 *   E5
 *   E6
 *   E8
 *
 *  MEDIO
 *   E9
 *   E11
 *   E12
 *   E13
 *
 *  DIFICIL
 *   E16
 *   E17
 *   E20
 * ---------------------------------------------------------------------
 */
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // TODO: escreva aqui os metodos dos exercicios de produto.

    List<Produto> findByNome(String nome);

    List<Produto> findByPrecoGreaterThan(BigDecimal preco);

    List<Produto> findByAtivoTrue();

    List<Produto> findByCategoriaNome(String nome);

    List<Produto> findByNomeContainingIgnoreCase(String termo);

    long countByCategoriaNome(String nome);

    List<Produto> findByPrecoBetweenOrderByPrecoAsc(BigDecimal min, BigDecimal max);

    List<Produto> findByEstoqueLessThanAndAtivoTrue(Integer estoque);

    List<Produto> findTop3ByOrderByPrecoDesc();

    @Query("SELECT p FROM Produto p WHERE p.preco BETWEEN :min AND :max")
    List<Produto> buscarPorFaixaDePreco(BigDecimal min, BigDecimal max);

    @Query("SELECT DISTINCT i.produto FROM ItemPedido i")
    List<Produto> buscarProdutosVendidos();

    @Query("SELECT p FROM Produto p WHERE p NOT IN (SELECT i.produto FROM ItemPedido i)")
    List<Produto> buscarProdutosNuncaVendidos();


}




