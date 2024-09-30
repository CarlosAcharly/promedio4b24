public class Estudiante {

    private String matricula;
    private String nombre;
    private double estrucuturas;
    private double evaluacion;
    private double ingles;
    private double promedio;

    // Setters and Getters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matric) {
        this.matricula = matric;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstrucuturas() {
        return estrucuturas;
    }

    public void setEstrucuturas(double estrucuturas) {
        this.estrucuturas = estrucuturas;
    }

    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }

    // constructor
    public Estudiante(String m, String n) {
        // contruye el objeto y lo inicializa
        this.matricula = m;
        this.nombre = n;
    }
}
