package panel;

import utils.Dades;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**Aquesta classe, com el seu nom indica, s'encarrega del que seria l'interficie gràfica de la pràctica.
 * @author Lanque
 */
public class Interficie extends JPanel {
    private JComboBox especiedesp;
    private JLabel especie;
    private JComboBox habitatdesp;
    private JLabel jcomp4;
    private JComboBox sexo;
    private JLabel jcomp6;
    private JTextField profundidad;
    private JLabel jcomp8;
    private JTextField tiemponav;
    private JLabel jcomp10;
    private JTextField horalleg;
    private JLabel jcomp12;
    private JTextField cebo;
    private JLabel jcomp14;
    private JLabel jcomp15;
    private JTextField temp;
    private JComboBox parasito;
    private JLabel jcomp18;
    private JButton recollir;

    /**
     * Metode encarregat de la producció de la Interficie.
     */
    public Interficie() {
        //construct preComponents
        String[] especiedespItems = {"Pez payaso", "Pez globo", "Tiburon Blanco", "Tinuron Ballena", "Raya toro", "Manta cornuda"};
        String[] habitatdespItems = {"Mar(agua salada)", "Río(agua dulce)", "Zona rocosa"};
        String[] sexoItems = {"Macho", "Hembra"};
        String[] parasitoItems = {"Sí", "No"};

        //construct components
        especiedesp = new JComboBox (especiedespItems);
        especie = new JLabel ("Especie");
        habitatdesp = new JComboBox (habitatdespItems);
        jcomp4 = new JLabel ("Hàbitat");
        sexo = new JComboBox (sexoItems);
        jcomp6 = new JLabel ("Sexo");
        profundidad = new JTextField (5);
        jcomp8 = new JLabel ("Profundidad (M)");
        tiemponav = new JTextField (5);
        jcomp10 = new JLabel ("Tiempo de navegación(h)");
        horalleg = new JTextField (5);
        jcomp12 = new JLabel ("Hora de llegada");
        cebo = new JTextField (5);
        jcomp14 = new JLabel ("Tipo de cebo");
        jcomp15 = new JLabel ("Temperatura");
        temp = new JTextField (5);
        parasito = new JComboBox (parasitoItems);
        jcomp18 = new JLabel ("Parásitos");
        recollir = new JButton("Recollir dades");

        //adjust size and set layout
        setPreferredSize (new Dimension (624, 361));
        setLayout (null);
        setBackground(Color.magenta);

        //add components
        add (especiedesp);
        add (especie);
        add (habitatdesp);
        add (jcomp4);
        add (sexo);
        add (jcomp6);
        add (profundidad);
        add (jcomp8);
        add (tiemponav);
        add (jcomp10);
        add (horalleg);
        add (jcomp12);
        add (cebo);
        add (jcomp14);
        add (jcomp15);
        add (temp);
        add (parasito);
        add (jcomp18);
        add(recollir);

        //set component bounds (only needed by Absolute Positioning)
        especiedesp.setBounds (25, 30, 100, 25);
        especie.setBounds (25, 10, 100, 25);
        habitatdesp.setBounds (165, 30, 100, 25);
        jcomp4.setBounds (165, 10, 100, 25);
        sexo.setBounds (300, 30, 100, 25);
        jcomp6.setBounds (300, 10, 100, 25);
        profundidad.setBounds (25, 115, 100, 25);
        jcomp8.setBounds (25, 90, 100, 25);
        tiemponav.setBounds (170, 115, 100, 25);
        jcomp10.setBounds (170, 90, 195, 25);
        horalleg.setBounds (345, 115, 100, 25);
        jcomp12.setBounds (345, 90, 100, 25);
        cebo.setBounds (25, 205, 100, 25);
        jcomp14.setBounds (25, 180, 100, 25);
        jcomp15.setBounds (330, 180, 100, 25);
        temp.setBounds (330, 205, 100, 25);
        parasito.setBounds (180, 205, 100, 25);
        jcomp18.setBounds (180, 180, 100, 25);
        recollir.setBounds(400, 250, 100, 25);
        recollir.addActionListener(this::recollir_dades);
    }

    /**Amb el següent metode li donem funcionalitat al botó recollir i fem que al fer-lo servir
     * guardi les dades introduides al panel a la base de dades.
     */
    private void recollir_dades(ActionEvent actionEvent){
        String especie = (String) especiedesp.getSelectedItem();
        String habitat = (String) habitatdesp.getSelectedItem();
        String sex = (String) sexo.getSelectedItem();
        String parasitos = (String) parasito.getSelectedItem();

        String prof = profundidad.getText();
        String nav = tiemponav.getText();
        String arrib = horalleg.getText();
        String ce = cebo.getText();
        String temper = temp.getText();

        Dades con=new Dades();
        con.insertar_dades(especie, habitat, sex, parasitos, prof, nav, arrib, ce, temper);
    }



}