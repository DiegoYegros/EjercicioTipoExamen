public class Recurso {
    private int id;
    private String abreviatura;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id=" + id +
                ", abreviatura='" + abreviatura + '\'' +
                '}';
    }
}
