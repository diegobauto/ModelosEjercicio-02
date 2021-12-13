package Equipamiento;

public class EquipamientoSoldado implements Equipamiento{
    @Override
    public Armadura crearArmadura() {
        return new ArmaduraSoldado();
    }

    @Override
    public Arma crearArma() {
        return new ArmaSoldado();
    }

    @Override
    public Medio crearMedio() {
        return new MedioSoldado();
    }
}
