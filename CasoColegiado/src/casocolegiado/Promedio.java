
package casocolegiado;

import javax.swing.JOptionPane;

public class Promedio {
    //  Atributos
    double suma = 0;
    double promedio = 0;
    //Sacar el promedio
    public void Promedio(estudiantes[] estudiantes){
        for (int i = 0; i < estudiantes.length ; i++){
            suma = suma + estudiantes[i].getCalificacion();
            promedio = suma / 10;
        }
        JOptionPane.showMessageDialog(null, "El promedio de las calificaciones es: "+promedio);
    
    }
}
