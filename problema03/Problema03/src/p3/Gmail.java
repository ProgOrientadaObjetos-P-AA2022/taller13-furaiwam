package p3;

public class Gmail implements DominioGmail{
    private String dominio;

    @Override
    public void establecerDominio(){
        dominio = "gmail.com";
    }

    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
