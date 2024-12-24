package br.com.alura.screenmatch.model;
import java.time.LocalDate;

public class Episodio {
    private  Integer tempora;
    private String titulo;
    private Integer numeroEpisodio;
    // @JsonAlias("Season") String temporada,
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio ) {
        this.tempora = numeroTemporada;
        this.titulo = dadosEpisodio.titulo();

        this.numeroEpisodio = dadosEpisodio.numero();
        try {    this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }

        try {
            this.dataLancamento = LocalDate.parse(dadosEpisodio.dataLancamento());
        } catch (Exception ex) {
            this.dataLancamento = null;
        }

    }

    public Integer getTempora() {
        return tempora;
    }

    public void setTempora(Integer tempora) {
        this.tempora = tempora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumero() {
        return numeroEpisodio;
    }

    public void setNumero(Integer numero) {
        this.numeroEpisodio = numero;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return  "tempora=" + tempora +
                ", titulo='" + titulo + '\'' +
                ", numeroEpisodio=" + numeroEpisodio +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}
