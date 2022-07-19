package p3;

public class UTPL implements DominioGmail {
    private String dominio;

    @Override
    public void establecerDominio(){
        dominio = "utpl.edu.ec";
    }

    @Override
    public String obtenerDominio(){
        return dominio;
    }
}
