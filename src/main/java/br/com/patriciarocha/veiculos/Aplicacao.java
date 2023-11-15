package br.com.patriciarocha.veiculos;

import br.com.patriciarocha.veiculos.model.Multa;
import br.com.patriciarocha.veiculos.model.Veiculo;
import br.com.patriciarocha.veiculos.model.enums.TipoVeiculoEnum;
import br.com.patriciarocha.veiculos.repository.MultaRepository;
import br.com.patriciarocha.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Aplicacao {

    @Autowired
    private VeiculoRepository veiculoRepo;

    @Autowired
    private MultaRepository multaRepo;

    public void executar(){
        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculoEnum.AUTOMOVEL,
                "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculoEnum.ONIBUS,
                "Enterprise", 1960, "prata");


        veiculoRepo.save(veiculo1);
        veiculoRepo.save(veiculo2);

        //Atualizando dados
        veiculo1.setCor("branco");
        veiculoRepo.save(veiculo1);

        Multa multa1 = new Multa("Gothan City", "Farol apagado", 250F, veiculo1);
        Multa multa2 = new Multa("Gothan City", "Insulfilm", 100F, veiculo1);
        Multa multa3 = new Multa("Hiper-espaço", "Excesso velocidade", 400F, veiculo2);

        multaRepo.save(multa1);
        multaRepo.save(multa2);
        multaRepo.save(multa3);

        //Atualizando dados
        multa2.setLocal("Recife");
        multaRepo.save(multa2);

        multa3.setValor(380F);
        multaRepo.save(multa3);

        //consultando e exibindo dados no console
        System.out.println(" - - - - - - - - ");
        System.out.println();
        List<Veiculo> veiculos = veiculoRepo.findAll();
        for(Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
        System.out.println(" - - - - - - - - ");

        System.out.println();
        List<Multa> multas = multaRepo.findAll();
        for(Multa multa : multas) {
            System.out.println(multa);
        }

    }

}
