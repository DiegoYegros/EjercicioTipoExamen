public class Menu extends Recurso{
    private String descripcion;
    private boolean padre;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isPadre() {
        return padre;
    }

    public void setPadre(boolean padre) {
        this.padre = padre;
    }
}
