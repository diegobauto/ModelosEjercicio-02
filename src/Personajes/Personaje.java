package Personajes;

import javax.swing.ImageIcon;

public class Personaje implements Cloneable{
    private int vida;
    private int fuerza;
    private String exp;
    private ImageIcon imagen;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    @Override
    public Personaje clone() {
        Personaje clonedPersonaje = null;
        try {
            clonedPersonaje = (Personaje) super.clone();
            clonedPersonaje.setVida(vida);
            clonedPersonaje.setFuerza(fuerza);
            clonedPersonaje.setExp(exp);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        } // catch	
        return clonedPersonaje;
    } // method clone

    public String traerPersonaje() {
        return "\n- Vida: " + getVida() + "\n- Fuerza: " + getFuerza()+ "\n- Exp: " + getExp();
    }
}
