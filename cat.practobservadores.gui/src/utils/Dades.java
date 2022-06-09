package utils;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import entities.Animals;



/**És la clase amb la que guardo les dades que introduirem a la interficie a la meva base de dades.
 * @author Lanque
 */
public class Dades {
    private Probabd conexio;
    private Connection proba;
    private Animals animal;

    public Dades(){
        conexio= new Probabd();
        animal= new Animals();
    }

    /**Aquest metode l'he utilitzat per introduir els getters i fer una comprobació del funcionament a l'hora d'inserir les dades.
     */
    public void insertar_dades(String especie, String habitat, String sexo, String profundidad,String tiemponav, String horalleg,String cebo,String temp, String parasito){
        PreparedStatement psmnt;
        String sql;
        animal.setEspecie(especie);
        animal.setHabitat(habitat);
        animal.setSexo(sexo);
        animal.setProfundidad(profundidad);
        animal.setTiemponav(tiemponav);
        animal.setHoralleg(horalleg);
        animal.setCebo(cebo);
        animal.setTemp(temp);
        animal.setParasito(parasito);

        try{
            proba = conexio.getConnexio();
            sql="insert into animalesmarinos(especie, habitat, sexo, profundidad, tiemponav,horalleg,cebo, temp, parasito)" +
                    "values(?,?,?,?,?,?,?,?,?)";
            psmnt = proba.prepareStatement(sql);

            psmnt.setString(1,animal.getEspecie());
            psmnt.setString(2,animal.getHabitat());
            psmnt.setString(3,animal.getSexo());
            psmnt.setString(4,animal.getProfundidad());
            psmnt.setString(5,animal.getTiemponav());
            psmnt.setString(6,animal.getHoralleg());
            psmnt.setString(7,animal.getCebo());
            psmnt.setString(8,animal.getTemp());
            psmnt.setString(9,animal.getParasito());

            psmnt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Moltes gràcies, has inserit les dades d'un nou animal");

        }
        catch (SQLException sqle){
            JOptionPane.showMessageDialog(null, "Ha hagut un problema en la inserció: " + sqle.getMessage());

        }
    }
}

