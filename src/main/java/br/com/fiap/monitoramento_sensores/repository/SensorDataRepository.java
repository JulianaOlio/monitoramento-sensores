package br.com.fiap.monitoramento_sensores.repository;

import br.com.fiap.monitoramento_sensores.model.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepository extends JpaRepository<SensorData, Double> {
}
