import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class promedioGrupo {
    /*
     * Programa que calcula el promedio de un grupo
     * el tamano del grupo es N
     * Las calificaciones se leen y se almacen en un arreglo de tamano N
     */
    public static void main(String[] args) throws IOException {

        int N;// tamano del arreglo
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        double[] calificaciones;// arreglo de calificaciones
        double suma = 0;// para sumar las calificaciones
        double promedio;

        System.out.println("programa  que calcula el promedio del grupo");
        System.out.println("escribe el tamano del grupo");
        entrada = bufer.readLine();
        N = Integer.parseInt(entrada);

        // contruimos el arreglo
        calificaciones = new double[N];
        // leer las calificaciones de cada alumno
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("escribe la calificacion del alumno " + (i + 1) + ":");
            entrada = bufer.readLine();
            calificaciones[i] = Double.parseDouble(entrada);
            suma += calificaciones[i];
        }
        // calcular el promedio)
        promedio = suma / N;
        System.out.println("Las calificaciones del grupo son: ");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(calificaciones[i] + " ");
        }
        System.out.println("El promedio del grupo es: " + promedio);
    }
}