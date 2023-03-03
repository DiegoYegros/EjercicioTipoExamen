import java.util.ArrayList;
import java.util.List;

public class ManejadorRecursos {
    private List<Recurso> recursos;

    public ManejadorRecursos() {
        recursos = new ArrayList<>();
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }
    public void addRecurso(Recurso recurso){
        this.recursos.add(recurso);
    }
}
