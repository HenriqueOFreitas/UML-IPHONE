package aparelho_telefone;

public abstract class AparelhoTelefonico {
    private boolean ligado;
    private String modelo;

    protected abstract void ligar(String numero);
    protected abstract void atender();
    protected abstract void iniciarCorreioVoz();
}
