package entities;
/**Aquesta és una subclasse d'animals, Rayacornuda, i hereta els atributs de la superclasse
 */
public class Rayacornuda extends Animals{
    private String especie, habitat, sexo, profundidad, tiemponav, horalleg, cebo, temp, parasito;
    public Rayacornuda(String especie,String habitat,String sexo,String profundidad,String tiemponav,String horalleg,String cebo,String temp,String parasito){
        this.especie= getEspecie();
        this.habitat= getHabitat();
        this.sexo= getSexo();
        this.profundidad= getProfundidad();
        this.tiemponav= getTiemponav();
        this.horalleg= getHoralleg();
        this.cebo= getCebo();
        this.parasito=getParasito();
        this.temp=getTemp();
    }
    public String getEspecie() {
        return especie;
    }//getter: encarregat de tornar el valor de la instancia

    public String getHabitat() {
        return habitat;
    }//getter: encarregat de tornar el valor de la instancia

    public String getSexo() {
        return sexo;
    }//getter: encarregat de tornar el valor de la instancia

    public String getProfundidad() {
        return profundidad;
    }//getter: encarregat de tornar el valor de la instancia

    public String getTiemponav() {
        return tiemponav;
    }//getter: encarregat de tornar el valor de la instancia

    public String getHoralleg() {
        return horalleg;
    }//getter: encarregat de tornar el valor de la instancia

    public String getCebo() {
        return cebo;
    }//getter:Encarregat de tornar el valor de la instancia

    public String getTemp() {
        return temp;
    }//getter: encarregat de tornar el valor de la instancia

    public String getParasito() {
        return parasito;
    }//getter: encarregat de tornar el valor de la instancia

    public void setEspecie(String especie) {
        this.especie = especie;
    } //Setter: encarregat de modificar el valor d'un atribut

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setProfundidad(String profundidad) {
        this.profundidad = profundidad;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setTiemponav(String tiemponav) {
        this.tiemponav = tiemponav;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setHoralleg(String horalleg) {
        this.horalleg = horalleg;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setCebo(String cebo) {
        this.cebo = cebo;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setTemp(String temp) {
        this.temp = temp;
    }//Setter: encarregat de modificar el valor d'un atribut

    public void setParasito(String parasito) {
        this.parasito = parasito;
    }//Setter: encarregat de modificar el valor d'un atribut
}
