package com.escola.querypractice.repository;

import com.escola.querypractice.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * =====================================================================
 *  AQUI E ONDE VOCE TRABALHA!  (Clientes)
 * =====================================================================
 *
 * Imports que voce provavelmente vai precisar:
 *   import java.util.List;
 *   import java.math.BigDecimal;
 *   import java.time.LocalDate;
 *   import org.springframework.data.jpa.repository.Query;
 *   import org.springframework.data.repository.query.Param;
 *
 * ---------------------------------------------------------------------
 *  EXERCICIOS QUE USAM ESTE REPOSITORIO
 * ---------------------------------------------------------------------
 *  FACIL
 *   E4
 *
 *  MEDIO
 *   E10
 *   E14
 *
 *  DIFICIL
 *   E19
 * ---------------------------------------------------------------------
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // TODO: escreva aqui os metodos dos exercicios de cliente.

    List<Cliente> findByEstado(String estado);

    List<Cliente> findByDataNascimentoBefore(LocalDate data);

    @Query("SELECT c FROM Cliente c JOIN c.pedidos p GROUP BY c HAVING SUM(p.valorTotal) > :valor")
    List<Cliente> buscarClientesQueGastaramMaisQue(@Param("valor") BigDecimal valor);












}

