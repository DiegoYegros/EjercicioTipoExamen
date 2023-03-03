public class Pagina extends Recurso{
    private String nombre;
    private boolean isModal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isModal(String s) {
        return isModal;
    }

    public void setModal(String modal) {
        if (modal.equalsIgnoreCase("S"))
            this.isModal = true;
        else
            this.isModal = false;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "nombre='" + nombre + '\'' +
                ", isModal=" + isModal +
                "} " + super.toString();
    }
}
