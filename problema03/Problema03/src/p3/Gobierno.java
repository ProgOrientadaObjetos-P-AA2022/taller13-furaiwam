package p3;

public class Gobierno implements DominioGmail{
        private String dominio;

        @Override
        public void establecerDominio(){
            dominio = "gobierno.gob.ec";
        }

        @Override
        public String obtenerDominio(){
            return dominio;
        }
}
