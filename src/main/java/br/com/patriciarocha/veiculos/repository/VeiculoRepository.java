package br.com.patriciarocha.veiculos.repository;

import br.com.patriciarocha.veiculos.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo,String > {
}
