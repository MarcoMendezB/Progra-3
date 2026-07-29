public class Estudiante {
    private String nombre;
    private int edad;
    private double nota;

    private static int totalEstudiantes = 0;

    public Estudiante(String nombre, int edad, double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;

        totalEstudiantes++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public static int getTotalEstudiantes() {
        return totalEstudiantes;
    }

    @Override
    public String toString(){
        return "Estudiante " + nombre + " Edad " + edad + " nota " +nota;
    }
}

