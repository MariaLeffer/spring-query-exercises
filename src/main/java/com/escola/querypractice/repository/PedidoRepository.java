package com.escola.querypractice.repository;

import com.escola.querypractice.model.Pedido;
import com.escola.querypractice.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * =====================================================================
 *  AQUI E ONDE VOCE TRABALHA!  (Pedidos)
 * =====================================================================
 *
 * Imports que voce provavelmente vai precisar:
 *   import java.util.List;
 *   import java.math.BigDecimal;
 *   import com.escola.querypractice.model.StatusPedido;
 *   import org.springframework.data.jpa.repository.Query;
 *   import org.springframework.data.repository.query.Param;
 *
 * ---------------------------------------------------------------------
 *  EXERCICIOS QUE USAM ESTE REPOSITORIO
 * ---------------------------------------------------------------------
 *  FACIL
 *   E7
 *
 *  MEDIO
 *   E15
 *
 *  DIFICIL
 *   E18
 * ---------------------------------------------------------------------
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    // TODO: escreva aqui os metodos dos exercicios de pedido.

  List<Pedido> findByStatus(StatusPedido status);

  List<Pedido> findByClienteIdOrderByDataPedidoDesc(Long clienteId);


}
