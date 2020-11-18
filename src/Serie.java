public class Serie implements Video {
    // atributos
    private String idiomaAudio;
    private String idiomaLegenda;
    private boolean estaPausado = false;
    private String nome;
    private int temporadas;
    private int anoLancamento;
    private int epTemporada;
    private boolean primeiraVez = true;
    private boolean legendaI = false;
    private boolean legendaA = false;

    // construtor
    public Serie(String nome, int temporadas, int epTemporada, String idiomaAudio, String idiomaLegenda) {
        this.nome = nome;
        this.temporadas = temporadas;
        this.epTemporada = epTemporada;
        this.idiomaAudio = idiomaAudio;
        this.idiomaLegenda = idiomaLegenda;

    }

    // metodos

    public void executar() {
        // primeira vez que esta executando
        if (primeiraVez) {
            System.out.println("Você está assistindo " + getNome() + " " + getTemporadas() + " temporda episódio "
                    + getEpTemporada());
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
        detalhes[1] = Integer.toString(this.getTemporadas());
        detalhes[2] = Integer.toString(this.getEpTemporada());

        System.out.println("Status da série");
        for (int i = 0; i < detalhes.length; i++) {
            System.out.println(detalhes[i]);
        }

    }

    // get e set
    /**
     * @return String return the idiomaAudio
     */
    public String epTemporada() {
        return epTemporada();
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
     * @return int return the temporadas
     */
    public int getTemporadas() {
        return temporadas;
    }

    /**
     * @param temporadas the temporadas to set
     */
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
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

    /**
     * @return int return the epTemporada
     */
    public int getEpTemporada() {
        return epTemporada;
    }

    /**
     * @param epTemporada the epTemporada to set
     */
    public void setEpTemporada(int epTemporada) {
        this.epTemporada = epTemporada;
    }

    /**
     * @return boolean return the primeiraVez
     */
    public boolean isPrimeiraVez() {
        return primeiraVez;
    }

    /**
     * @param primeiraVez the primeiraVez to set
     */
    public void setPrimeiraVez(boolean primeiraVez) {
        this.primeiraVez = primeiraVez;
    }

    /**
     * @return boolean return the legendaI
     */
    public boolean isLegendaI() {
        return legendaI;
    }

    /**
     * @param legendaI the legendaI to set
     */
    public void setLegendaI(boolean legendaI) {
        this.legendaI = legendaI;
    }

    /**
     * @return boolean return the legendaA
     */
    public boolean isLegendaA() {
        return legendaA;
    }

    /**
     * @param legendaA the legendaA to set
     */
    public void setLegendaA(boolean legendaA) {
        this.legendaA = legendaA;
    }

}
