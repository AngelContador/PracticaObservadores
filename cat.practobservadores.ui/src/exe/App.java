package Exe;

import javax.swing.*;
import panel.Interficie;
import utils.Probabd;


/** Aquesta clase és la que ens permet fer l'execucuió del programa, també coneguda com classe controladora.
 *  @author Lanque
 */
public class App {
    /**
     * El metode següent fa l'execució del programa.
     * @param args
     */
    public static void main (String[] args) {
        Probabd.Connexio();
        System.out.println("A continuacio fes el registre de l'animal observat...");
        JFrame frame = new JFrame ("Interficie");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Interficie());
        frame.pack();
        frame.setVisible (true);
    }
}
