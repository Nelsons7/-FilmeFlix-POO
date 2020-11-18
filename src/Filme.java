public class Filme implements Video {
    // atributos

    private int duracao;
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado = false;
    private String nome;
    private int anoLancamento;
    private boolean primeiraVez = true;
    private boolean legendaI = false;
    private boolean legendaA = false;

    // construtor
    public Filme(String nome, int duracao, int anoLancamento, String idiomaAudio, String idiomaLegenda) {
        this.nome = nome;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.idiomaAudio = idiomaAudio;
        this.idiomaLegenda = idiomaLegenda;

    }

    // metodos
    public void executar() {
        // primeira vez que esta executando
        if (primeiraVez) {
            System.out.println("Você está assistindo " + getNome());
            primeiraVez = false;

        } else if (estaPausado) {
            System.out.println("O vídeo está sendo executado!!");
        }

    }

    public void pausar() {

        if (estaPausado) {

            estaPausado = false;
        } else {
            estaPausado = true;
            System.out.println("O Vídeo foi pausado!");
        }

    }

    public void mudarAudio() {
        if (getIdiomaAudio().equals("ingles")) {
            setIdiomaAudio("portugues");
            System.out.println("O audio reproduzido está em: " + idiomaAudio);
        } else {
            setIdiomaAudio("ingles");
            System.out.println("O audio reproduzido está em: " + idiomaAudio);
        }
    }

    public void mudarLegenda() {
        if (getIdiomaLegenda().equals("ingles")) {
            setIdiomaLegenda("portugues");
            System.out.println("A legenda reproduzido está em: " + idiomaLegenda);
        } else {
            setIdiomaLegenda("ingles");
            System.out.println("A legenda reproduzido está em: " + idiomaLegenda);
        }
    }

    public void exibirDetalhes() {
        String[] detalhes = new String[3];

        detalhes[0] = this.getNome();
        detalhes[1] = Integer.toString(this.getDuracao());
        detalhes[2] = Integer.toString(this.getAnoLancamento());

        System.out.println("Status do filme");
        for (int i = 0; i < detalhes.length; i++) {
            System.out.println(detalhes[i]);
        }

    }

    // get e set

    /**
     * @return String return the idiomaAudio
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * @return String return the idiomaAudio
     */
    public String getIdiomaAudio() {
        return idiomaAudio;
    }

    /**
     * @param idiomaAudio the idiomaAudio to set
     */
    public void setIdiomaAudio(String idiomaAudio) {
        this.idiomaAudio = idiomaAudio;
    }

    /**
     * @return String return the idiomaLegenda
     */
    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    /**
     * @param idiomaLegenda the idiomaLegenda to set
     */
    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    /**
     * @return boolean return the estaPausado
     */
    public boolean isEstaPausado() {
        return estaPausado;
    }

    /**
     * @param estaPausado the estaPausado to set
     */
    public void setEstaPausado(boolean estaPausado) {
        this.estaPausado = estaPausado;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the anoLancamento
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }

    /**
     * @param anoLancamento the anoLancamento to set
     */
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

}
