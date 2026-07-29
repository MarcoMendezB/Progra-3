import java.util.ArrayList;



public static double calcularPromedio(ArrayList<Estudiante> lista){
    if(lista.isEmpty()){
        return 0.0;
    }
    double suma = 0.0;

    for (Estudiante e : lista){
        suma += e.getNota();
    }
    return suma/lista.size();
}


    void main() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Marco", 19, 95));
        estudiantes.add(new Estudiante("Manolo", 23, 40));
        estudiantes.add(new Estudiante("Marta", 42, 75));

        double promedio = calcularPromedio(estudiantes);

        IO.println("El promedio es "+ promedio);

        IO.println("\n --- Lista de Estudiantes ---");
        for (Estudiante e : estudiantes){
            IO.println(e);
        }
        IO.println("\n Total de Estudiantes: "+ Estudiante.getTotalEstudiantes());
    }
