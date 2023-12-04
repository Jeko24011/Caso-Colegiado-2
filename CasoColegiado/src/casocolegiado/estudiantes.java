
package casocolegiado;

public class estudiantes {
    
    //atributos:
    public String Nombre;
    public String Curso;
    public String Profesor;
    public double Calificacion;

    //constructor
    public estudiantes(String Nombre, String Curso, String Profesor, double Calificacion) {
        this.Nombre = Nombre;
        this.Curso = Curso;
        this.Profesor = Profesor;
        this.Calificacion = Calificacion;
    }
    
    //setters

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public void setProfesor(String Profesor) {
        this.Profesor = Profesor;
    }

    public void setCalificacion(double Calificacion) {
        this.Calificacion = Calificacion;
    }
    
    //getters

    public String getNombre() {
        return Nombre;
    }

    public String getCurso() {
        return Curso;
    }

    public String getProfesor() {
        return Profesor;
    }

    public double getCalificacion() {
        return Calificacion;
    }

    //formato para guardar informacion
    @Override
    public String toString() {
        return "estudiantes{" + "Nombre=" + Nombre + ", Curso=" + Curso + ", Profesor=" + Profesor + ", Calificacion=" + Calificacion + '}';
    }
    
    
    
    
    
}
