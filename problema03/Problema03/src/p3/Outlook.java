package p3;

public class Outlook implements DominioGmail {
    private String dominio;

    @Override
    public void establecerDominio(){
        dominio = "outlook.com";
    }

    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
