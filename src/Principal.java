import br.com.alura.screenmatch2.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch2.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch2.modelos.Episodio;
import br.com.alura.screenmatch2.modelos.Filme;
import br.com.alura.screenmatch2.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração (min): " + meuFilme.getDuracaoEmMinutos());

        filtro.filtra(meuFilme);

        System.out.println("""
                          
                          """);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setDuracaoEmMinutos(180);

        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost (min): " + lost.getDuracaoEmMinutos());

        //afirmando coisas sobre a série
        Episodio episodio = new Episodio();
        episodio.setNum(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        System.out.println("""
                          
                          """);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println("Quanto tempo para assistir tudo: " + calculadora.getTempoTotal());



    }
}


