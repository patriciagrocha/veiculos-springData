package br.com.patriciarocha.veiculos;

import br.com.patriciarocha.veiculos.model.Veiculo;
import br.com.patriciarocha.veiculos.model.enums.TipoVeiculoEnum;
import br.com.patriciarocha.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepo;

    public void executar(){
        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculoEnum.AUTOMOVEL,
                "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculoEnum.ONIBUS,
                "Enterprise", 1960, "prata");

        veiculoRepo.save(veiculo1);
        veiculoRepo.save(veiculo2);

        System.out.println(" - - - - - - - - ");
        System.out.println();
        List<Veiculo> veiculos = veiculoRepo.findAll();
        for(Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
        System.out.println(" - - - - - - - - ");
    }


}
