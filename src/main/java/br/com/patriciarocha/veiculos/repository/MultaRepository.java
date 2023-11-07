package br.com.patriciarocha.veiculos.repository;

import br.com.patriciarocha.veiculos.model.Multa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultaRepository extends JpaRepository<Multa,Integer > {
}
