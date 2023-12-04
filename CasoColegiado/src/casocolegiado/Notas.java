
package casocolegiado;

import javax.swing.JOptionPane;

public class Notas {
     // atributos
        String datos = "";
        String RESULTADO = "";
        String ResultadoMenor = "";
        double NotaMayor = 0;
        String ResultadoMayor = "";
        double NotaMenor = 0;
        
        //clase promedio
        Promedio promedio = new Promedio();
    
    public void NotasMenores(estudiantes[] estudiantes){
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCalificacion() < promedio.promedio){
                datos += estudiantes[i].toString() + "\n" ;
            }
        }
            JOptionPane.showMessageDialog(null, "los estudiantes con nota menor al promedio son: \n\n"+datos);
    }
 
    public void NotasMayores(estudiantes[] estudiantes){
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCalificacion()> promedio.promedio){
                RESULTADO += estudiantes[i].toString() + "\n" ;
            }
        }
            JOptionPane.showMessageDialog(null, "Estudiantes con notas mayores al promedio: \n\n"+RESULTADO);
    }
    
    public void MenorNota(estudiantes[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            NotaMenor = estudiantes[i].getCalificacion();
            if (estudiantes[i].getCalificacion()<= NotaMenor ){
                ResultadoMenor = estudiantes[i].toString();
            }
        }
            JOptionPane.showMessageDialog(null, "El estudiante que obtuvo la nota menor es: \n"+ResultadoMenor);
        
    }
    
    public void MayorNota(estudiantes[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            NotaMayor = estudiantes[i].getCalificacion();
            
            if (estudiantes[i].getCalificacion()<= NotaMayor ){
                ResultadoMayor = estudiantes[i].toString();
            }
        }
            JOptionPane.showMessageDialog(null, "El estudiante que obtuvo la nota menor es: \n"+ResultadoMayor);
        
    }
}

