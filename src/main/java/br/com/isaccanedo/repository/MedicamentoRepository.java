package br.com.isaccanedo.repository;

import br.com.isaccanedo.model.MedicamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentoRepository extends JpaRepository<MedicamentoModel, Long> {
}
