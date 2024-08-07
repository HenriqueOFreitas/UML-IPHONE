package aparelho_telefone;

public abstract class AparelhoTelefonico {
    private boolean ligado;

    protected abstract void ligar(String numero);
    protected abstract void atender();
    protected abstract void iniciarCorreioVoz();

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
