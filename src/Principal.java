public class Principal {
    public static void main(String[] args) {
        // classe 1
        Filme filme = new Filme("Vingadores Ultimato", 180, 2019, "ingles", "portugues");

        filme.exibirDetalhes();
        filme.executar();
        filme.pausar();
        filme.executar();
        filme.mudarAudio();
        filme.mudarAudio();
        filme.mudarLegenda();
        filme.mudarLegenda();

        // espaçamento entre filme e serie
        System.out.println("_____________________________________________________________________");
        // classe 2
        Serie serie = new Serie("Supernatural", 15, 20, "ingles", "portugues");

        serie.exibirDetalhes();
        serie.executar();
        serie.executar();
        serie.pausar();
        serie.executar();
        serie.mudarAudio();
        serie.mudarAudio();
        serie.mudarLegenda();
        serie.mudarLegenda();
    }
}
