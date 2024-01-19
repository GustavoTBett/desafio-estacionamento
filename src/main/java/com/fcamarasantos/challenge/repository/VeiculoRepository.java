package com.fcamarasantos.challenge.repository;

import com.fcamarasantos.challenge.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gustavo
 */
@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    
}
