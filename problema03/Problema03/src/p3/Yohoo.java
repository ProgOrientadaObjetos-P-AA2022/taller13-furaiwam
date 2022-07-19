package p3;

public class Yohoo implements DominioGmail {
    private String dominio;

    @Override
    public void establecerDominio(){
        dominio = "yahoo.com";
    }

    @Override
    public String obtenerDominio(){
        return dominio;
    }

}
