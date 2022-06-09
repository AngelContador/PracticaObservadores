package utils;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;

public class Probabd {
    public static Connection Connexio(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection proba=DriverManager.getConnection("jdbc:mysql://localhost:3306/animalsmar ","root","angelconta");
            Statement smnt=proba.createStatement();
            ResultSet resultat=smnt.executeQuery("SHOW DATABASES;");
            System.out.println("La connexio amb la base de dades es correcta");
        }
        catch (Exception excepcio){
            System.out.println(excepcio);
        }
        return null;
    }
    public Connection getConnexio(){
        Connection proba= null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            proba= DriverManager.getConnection("jdbc:mysql://localhost:3306/animalsmar ","root","angelconta");
        }
        catch (Exception excepcio){
            System.out.println("Hi ha hagut un error:" + excepcio.getMessage());
        }
        return proba;
    }

}
