package br.com.alura.database.h2;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.mvc.mudi.model.Pedido;

public interface PedidoRepositorio extends CrudRepository<Pedido, Long>{

}
