package Personajes;

public class CreacionPersonaje {
    private final Caballero caballero;
    private final Soldado soldado;
    private final Lancero lancero;
    
    public CreacionPersonaje() {
        caballero = new Caballero();
        soldado = new Soldado();
        lancero = new Lancero();
        
        caballero.setVida(100);
        caballero.setFuerza(8);
        caballero.setExp("2 años");
        caballero.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/caballero.gif")));
        
        soldado.setVida(100);
        soldado.setFuerza(10);
        soldado.setExp("5 años");
        soldado.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/soldado.gif")));
        
        lancero.setVida(100);
        lancero.setFuerza(5);
        lancero.setExp("8 años");
        lancero.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Interfaz/lancero.gif")));
    }
    
    public Personaje getPersonajeClone(String tipoPersonaje) {
        if (null != tipoPersonaje) switch (tipoPersonaje) {
            case "Caballero":
                return (Personaje) caballero.clone();
            case "Soldado":
                return (Personaje) soldado.clone();
            case "Lancero":
                return (Personaje) lancero.clone();
            default:
                break;
        }
        return null;
    }
}
