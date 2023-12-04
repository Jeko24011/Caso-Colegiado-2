package casocolegiado;

import javax.swing.JOptionPane;

public class CasoColegiado {

    public static void main(String[] args) {
        //atributos
        String resultado="";
        
        //Crear arraylist para guardar los datos
        estudiantes arraylist[] = new estudiantes[10];
        
        // Ingresar datos para el arreglo:
        for (int i = 0; i < arraylist.length; i++) {
            int x = 1;
            JOptionPane.showMessageDialog(null, "Ingrese los datos para el estudiante "+x+". ");
            String Nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            String Curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante: ");
            String Profesor = JOptionPane.showInputDialog("Ingrese el nombre del profesor: ");
            double Calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificacion: "));
            
            arraylist[i] = new estudiantes(Nombre, Curso, Profesor, Calificacion);
            x++;
        }
        
        //datos de la arraylist
        for (int i = 0; i < arraylist.length; i++) {
            int x = 1;
            resultado += x+" "+arraylist[i].toString() + "\n" ;
            x++;
        }
        JOptionPane.showMessageDialog(null, resultado);
        
        //clase promedio
        Promedio Promedio = new Promedio();
        //obtener el promedio
        Promedio.Promedio(arraylist);
        
        //clase Notas
        Notas Notas = new Notas();
        
        Notas.NotasMayores(arraylist);
        Notas.NotasMenores(arraylist);
        Notas.MayorNota(arraylist);
        Notas.MenorNota(arraylist);

    }
    
}
