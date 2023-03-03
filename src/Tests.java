import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
    ManejadorRecursos manejadorRecursos = new ManejadorRecursos();
    try {
        Scanner scanner = new Scanner(new File(Globals.MENUS));
        while (scanner.hasNextLine()) {
            Menu menu = new Menu();
            String data = scanner.nextLine();
            List<String> menuData = Arrays.asList(data.split(",[ ]*"));
            menu.setId(Integer.parseInt(menuData.get(0)));
            menu.setAbreviatura(menuData.get(1));
            menu.setDescripcion(menuData.get(2));
            menu.setPadre(menuData.get(3));
            manejadorRecursos.addRecurso(menu);
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    try {
        Scanner scanner = new Scanner(new File(Globals.PAGINAS));
        while (scanner.hasNextLine()) {
            Pagina pagina = new Pagina();
            String data = scanner.nextLine();
            List<String> paginaData = Arrays.asList(data.split(",[ ]*"));
            pagina.setId(Integer.parseInt(paginaData.get(0)));
            pagina.setAbreviatura(paginaData.get(1));
            pagina.setNombre(paginaData.get(2));
            pagina.setModal(paginaData.get(3));
            manejadorRecursos.addRecurso(pagina);
        }
        scanner.close();
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    try {
        Scanner scanner = new Scanner(new File(Globals.BOTONES));
        while (scanner.hasNextLine()) {
            Boton boton = new Boton();
            String data = scanner.nextLine();
            List<String> botonData = Arrays.asList(data.split(",[ ]*"));
            boton.setId(Integer.parseInt(botonData.get(0)));
            boton.setAbreviatura(botonData.get(1));
            boton.setTexto(botonData.get(2));
            boton.setPagina((Pagina) manejadorRecursos.getRecursos().stream()
                    .filter(recurso -> recurso instanceof Pagina)
                    .map(recurso -> (Pagina) recurso)
                    .filter(pagina -> pagina.getNombre().equals(botonData.get(3)))
                    .findFirst()
                    .orElseThrow(RuntimeException::new));
        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    ProcesarRecursos procesarRecursos = new ProcesarRecursos();
    procesarRecursos.mostrarRecursos(manejadorRecursos.getRecursos());
}
}
