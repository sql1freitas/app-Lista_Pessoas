import org.example.Pessoas.Pessoa;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.Main.pessoaList;

public class TestListas {



    @Test
    public void TestarFiltroFeminino(){
        List<Pessoa> listaFeminina = pessoaList.stream()
                .filter(pessoa -> pessoa.getSexo() == 2)
                .collect(Collectors.toList());

        for (Pessoa pessoa: listaFeminina
             ) {
            Assert.assertTrue(pessoa.getSexo() == 2);

        }

        }

    }


