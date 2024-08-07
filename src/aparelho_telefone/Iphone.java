package aparelho_telefone;

public class Iphone extends AparelhoTelefonico{
    private ReprodutorMusica iTunes;
    private NavegadorInternet safari;

    private int armazenamentoEmGB;
    private String versaoDoIOS;

    public Iphone(String versaoIOS, int armazenamento) {
        versaoDoIOS = versaoIOS;
        armazenamentoEmGB = armazenamento;
        iTunes = new ReprodutorMusica();
        safari = new NavegadorInternet();
    }

    @Override
    protected void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    protected void atender() {
        System.out.println("Ligação em progresso 00:00");
    }

    @Override
    protected void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public int getArmazenamentoEmGB() {
        return armazenamentoEmGB;
    }

    public String getVersaoDoIOS() {
        return versaoDoIOS;
    }

    public NavegadorInternet getSafari() {
        return safari;
    }

    public ReprodutorMusica getiTunes() {
        return iTunes;
    }
}
