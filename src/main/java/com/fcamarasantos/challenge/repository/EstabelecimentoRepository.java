package com.fcamarasantos.challenge.repository;

import com.fcamarasantos.challenge.model.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gustavo
 */
@Repository
public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
    
}
