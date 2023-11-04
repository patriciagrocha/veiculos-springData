package br.com.patriciarocha.veiculos.model;

import br.com.patriciarocha.veiculos.model.enums.TipoVeiculoEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "VEICULOS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String placa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculoEnum tipoVeiculo;

    private String nome;

    private Integer anoFabricacao;

    private String cor;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "veiculo")
    private List<Multa> multas;

}
