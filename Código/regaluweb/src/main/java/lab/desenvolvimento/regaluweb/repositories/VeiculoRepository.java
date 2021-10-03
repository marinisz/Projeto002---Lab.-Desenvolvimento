package lab.desenvolvimento.regaluweb.repositories;

import lab.desenvolvimento.regaluweb.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {

}