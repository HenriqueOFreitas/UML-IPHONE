package aparelho_telefone;

public class ReprodutorMusica {
    private String musicaSelecionada;

    public void tocar() {
        System.out.println("Tocando " + musicaSelecionada);
    }

    public void pausar() {
        System.out.println("Pausando " + musicaSelecionada);
    }

    public void selecionarMusica(String musica) {
        musicaSelecionada = musica;

    }

    public String getMusicaSelecionada() {
        return musicaSelecionada;
    }
}
