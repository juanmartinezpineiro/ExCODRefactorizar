/*
 * Examen Refactorizacion
 * 
 */

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nombre;
        String edad;

        int mes;
        int dia;
        int hora;
        int anhoParseado;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        anhoParseado = Integer.parseInt(edad);

        mes = (anhoParseado * 12);
        dia = (anhoParseado * 365);
        hora = (dia * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dia, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hora, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
