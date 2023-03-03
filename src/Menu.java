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

    public void setPadre(String s) {
        if (s.equalsIgnoreCase("S")){
            this.padre = true;
        }
        else{
            this.padre = false;
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "descripcion='" + descripcion + '\'' +
                ", padre=" + padre +
                "} " + super.toString();
    }
}
