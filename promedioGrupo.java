import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedioGrupo {
    /*
     * Programa que calcula el promedio de un grupo
     * el tamano del grupo es N
     * Las calificaciones se leen y se almacen en un arreglo de tamano N
     */
    public static Estudiante[] estudiantes;
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    public static void leer_estudiantes() throws IOException {
        String matricula, nombre;
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("-----------------------");
            System.out.println("Información del estudiante [" + (i + 0) + "]");
            System.out.println("Matricula");
            entrada = bufer.readLine();
            matricula = entrada;
            System.out.println("Nombre");
            entrada = bufer.readLine();
            nombre = entrada;
            Estudiante e = new Estudiante(matricula, nombre);
            System.out.println("Escriba calificacion de estructuras: ");
            entrada = bufer.readLine();
            e.setEstructuras(Double.parseDouble(entrada));
            System.out.println("Escriba calificacion de evaluacion: ");
            entrada = bufer.readLine();
            e.setEvaluacion(Double.parseDouble(entrada));
            System.out.println("Escriba calificacion de ingles: ");
            entrada = bufer.readLine();
            e.setIngles(Double.parseDouble(entrada));
            e.setPromedio();
            estudiantes[i] = e; // agregamos un objeto estudiante al arreglo
        }
    }

    public static void main(String[] args) throws IOException {
        int N; // tamano del arreglo
        System.out.println("Ingrese el número de estudiantes:");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);
        estudiantes = new Estudiante[N]; // inicializamos el arreglo

        leer_estudiantes();

        // Aquí puedes agregar más lógica para calcular y mostrar el promedio del grupo
    }
}
