public class Boton extends Recurso{
    private String texto;
    private Pagina pagina;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Pagina getPagina() {
        return pagina;
    }

    public void setPagina(Pagina pagina) {
        this.pagina = pagina;
    }

    @Override
    public String toString() {
        return "Boton{" +
                "texto='" + texto + '\'' +
                ", pagina=" + pagina +
                "} " + super.toString();
    }
}
