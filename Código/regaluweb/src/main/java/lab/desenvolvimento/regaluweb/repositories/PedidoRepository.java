package lab.desenvolvimento.regaluweb.repositories;

import lab.desenvolvimento.regaluweb.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {

}
