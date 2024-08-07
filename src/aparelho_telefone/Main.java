package aparelho_telefone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone15 = new Iphone("iOS 15.8.3", 1024);
        iphone15.ligar("83 99999-3683");
        iphone15.getiTunes().selecionarMusica("I like the way you kiss me");
        iphone15.getiTunes().tocar();
        iphone15.getiTunes().pausar();
        iphone15.getSafari().exibirPagina("https://www.dio.me/");
    }
}
