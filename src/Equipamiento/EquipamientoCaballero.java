package Equipamiento;

public class EquipamientoCaballero implements Equipamiento{

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraCaballero();
    }

    @Override
    public Arma crearArma() {
        return new ArmaCaballero();
    }

    @Override
    public Medio crearMedio() {
        return new MedioCaballero();
    }

    
}
