package aparelho_telefone;

public abstract class AparelhoTelefonico {
    private boolean ligado;

    public abstract void ligar(String numero);
    public abstract void atender();
    public abstract void iniciarCorreioVoz();

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

}
